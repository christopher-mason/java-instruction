package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.Product;

public class ProductDb {

	public ProductDb() {
		
	}
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		
		return connection;
	}
	
	private Product getProductFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt("ID");
		int vendorID = rs.getInt("VendorID");
		String partNumber = rs.getString("PartNumber");
		String name = rs.getString("Name");
		double price = rs.getDouble("Price");
		String unit = rs.getString("Unit");
		String photoPath = rs.getString("PhotoPath");
		
		Product product = new Product(id, vendorID, partNumber,  name, price, unit, photoPath);
		
		return product;
		
	}
	
	public List<Product> getAll() {
		String selectAll = "SELECT * FROM product";
		try (Connection con = getConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(selectAll)) {
			List<Product> products = new ArrayList<>();
			
			while (rs.next()) {
				int id = rs.getInt("ID");
				int vendorId = rs.getInt("VendorID");
				String partNumber = rs.getString("PartNumber");
				String name = rs.getString("Name");
				double price = rs.getDouble("Price");
				String unit = rs.getString("Unit");
				String photoPath = rs.getString("PhotoPath");
				
				Product product = new Product(id, vendorId, partNumber, name, price, unit, photoPath);
				
				products.add(product);				
			}
			
			return products;
			
		} catch (SQLException e) {
			System.err.println("Error retrieving products. " + e);
			return null;
		}
	}
	
	public Product get(int id) {
		
		String productSelect = "SELECT * FROM PRODUCT WHERE ID = ?";
		
		try (Connection con = getConnection();
				PreparedStatement ps = con.prepareStatement(productSelect);
				) {
			
			ps.setLong(1, id);
			ResultSet products = ps.executeQuery();
			
			if (products.next()) {
				Product product = getProductFromResultSet(products);
				
				products.close();
				
				return product;
			} else {
				products.close();
				return null;
			}
				
		} catch (SQLException e) {
			System.err.println("Caught exception. Msg: " + e);
			return null;
		}
		
	}
	
	public boolean add(Product product) {
		String productINSERT = "INSERT INTO product(VendorID, PartNumber, Name, Price, Unit, PhotoPath) Values (?, ?, ?, ?, ?, ?)";
		
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productINSERT)) {
			ps.setInt(1, product.getVendorId());
			ps.setString(2, product.getPartNumber());
			ps.setString(3, product.getName());
			ps.setDouble(4, product.getPrice());
			ps.setString(5, product.getUnit());
			ps.setString(6, product.getPhotoPath());
			
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			System.err.println("Caught Exception. Msg: " + e);
			return false;
		}
	}
	
	public boolean delete(int id) {
		String productDelete = "DELETE FROM product WHERE ID = ?";
		
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productDelete)) {
			ps.setLong(1, id);
			
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			System.err.println("Caught Exception. Msg: " + e);
			return false;
		}
	}
	
	public boolean update(Product product) {
		String productUpdate = "UPDATE product SET VendorID = ?, PartNumber + ?, Name = ?, Price = ?, Unit = ?, PhotoPath = ?, WHERE ID = ?";
		
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productUpdate)) {
			ps.setInt(1, product.getVendorId());
			ps.setString(2, product.getPartNumber());
			ps.setString(3, product.getName());
			ps.setDouble(4, product.getPrice());
			ps.setString(5, product.getUnit());
			ps.setString(6, product.getPhotoPath());
			
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			System.err.println("Caught Exception. Msg: " + e);
			return false;
		}
		
	}
	
}
