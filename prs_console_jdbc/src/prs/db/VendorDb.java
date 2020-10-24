package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import prs.business.Vendor;

public class VendorDb {

	public VendorDb() {
		
	}
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		
		return connection;
	}
	
	private Vendor getVendorFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt("ID");
		String code = rs.getString("Code");
		String name = rs.getString("Name");
		String address = rs.getString("Address");
		String city = rs.getString("City");
		String state = rs.getString("State");
		String zipCode = rs.getString("Zip");
		String phoneNum = rs.getString("PhoneNumber");
		String emailAddress = rs.getString("Email");
		
		Vendor vendor = new Vendor(id, code, name, address, city, state, zipCode, phoneNum, emailAddress);
		
		return vendor;
	}
	
	public List<Vendor> getAll() {
		String selectAll = "SELECT * FROM vendor";
		try (Connection con = getConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(selectAll)) {
			List<Vendor> vendors = new ArrayList<>();
			
			while (rs.next()) {
				int id = rs.getInt("ID");
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				String address = rs.getString("Address");
				String city = rs.getString("City");
				String state = rs.getString("State");
				String zipCode = rs.getString("Zip");
				String phoneNum = rs.getString("PhoneNumber");
				String emailAddress = rs.getString("Email");
				
				Vendor vendor = new Vendor(id, code, name, address, city, state, zipCode, phoneNum, emailAddress);
				
				vendors.add(vendor);				
			}
			
			return vendors;
			
		} catch (SQLException e) {
			System.err.println("Error retrieving products. " + e);
			return null;
		}
	}
	
	public Vendor get(int id) {
		
		String vendorSelect = "SELECT * FROM VENDOR WHERE ID = ?";
		
		try (Connection con = getConnection();
				PreparedStatement ps = con.prepareStatement(vendorSelect);
				) {
			
			ps.setLong(1, id);
			ResultSet vendors = ps.executeQuery();
			
			if (vendors.next()) {
				Vendor vendor = getVendorFromResultSet(vendors);
				
				vendors.close();
				
				return vendor;
			} else {
				vendors.close();
				return null;
			}
				
		} catch (SQLException e) {
			System.err.println("Caught exception. Msg: " + e);
			return null;
		}
		
	}
	
	public boolean add(Vendor vendor) {
		String vendorINSERT = "INSERT INTO vendor(Code, Name, Address, City, State, Zip, PhoneNumber, Email) Values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(vendorINSERT)) {
			ps.setString(1, vendor.getCode());
			ps.setString(2, vendor.getName());
			ps.setString(3, vendor.getAddress());
			ps.setString(4, vendor.getCity());
			ps.setString(5, vendor.getState());
			ps.setString(6, vendor.getZipCode());
			ps.setString(7, vendor.getPhoneNum());
			ps.setString(8, vendor.getEmailAddress());
			
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			System.err.println("Caught Exception. Msg: " + e);
			return false;
		}
	}
	
	public boolean delete(int id) {
		String vendorDelete = "DELETE FROM vendor WHERE ID = ?";
		
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(vendorDelete)) {
			ps.setLong(1, id);
			
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			System.err.println("Caught Exception. Msg: " + e);
			return false;
		}
	}
	
	public boolean update(Vendor vendor) {
		String vendorUpdate = "UPDATE vendor SET CODE = ?, Name = ?, Address = ?, City = ?, State = ?, Zip = ?, PhoneNumber = ?, Email = ? WHERE ID = ?";
		
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(vendorUpdate)) {
			ps.setString(1, vendor.getCode());
			ps.setString(2, vendor.getName());
			ps.setString(3, vendor.getAddress());
			ps.setString(4, vendor.getCity());
			ps.setString(5, vendor.getState());
			ps.setString(6, vendor.getZipCode());
			ps.setString(7, vendor.getPhoneNum());
			ps.setString(8, vendor.getEmailAddress());
			ps.setInt(9, vendor.getId());
			
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			System.err.println("Caught Exception. Msg: " + e);
			return false;
		}
		
	}
	
}
