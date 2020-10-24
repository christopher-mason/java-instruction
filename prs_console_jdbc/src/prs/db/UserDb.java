package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import prs.business.User;


public class UserDb {
	
	public UserDb() {
		
	}

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		
		return connection;
	}
	
	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt("ID");
		String userName = rs.getString("UserName");
		String password = rs.getString("password");
		String firstName = rs.getString("firstName");
		String lastName = rs.getString("lastName");
		String phoneNumber = rs.getString("phoneNumber");
		String email = rs.getString("email");
		boolean isReviewer = rs.getBoolean("isReviewer");
		boolean isAdmin = rs.getBoolean("isAdmin");
		
		User user = new User(id, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
		
		return user;
	}
	
	public List<User> getAll() {
		String selectAll = "SELECT * FROM user";
		
		try (Connection con = getConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(selectAll)) {
			
			List<User> users = new ArrayList();
			
			while (rs.next()) {
				int id = rs.getInt("ID");
				String userName = rs.getString("UserName");
				String password = rs.getString("password");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String phoneNumber = rs.getString("phoneNumber");
				String email = rs.getString("email");
				boolean isReviewer = rs.getBoolean("isReviewer");
				boolean isAdmin = rs.getBoolean("isAdmin");
				
				User user = new User(id, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
				
				users.add(user);
			}
			
			return users;
			
		} catch (SQLException e) {
			System.err.println("Error retrieving users. " + e);
			return null;
		}
	}
	
	public User get(int id) {
		String userSelect = "SELECT * FROM user WHERE ID = ?";
		
		try (Connection con = getConnection();
				PreparedStatement ps = con.prepareStatement(userSelect);
				) {
			
			ps.setLong(1, id);
			ResultSet users = ps.executeQuery();
			
			if (users.next()) {
				User user = getUserFromResultSet(users);
				
				users.close();
				
				return user;
			} else {
				users.close();
				return null;
			}
		} catch (SQLException e) {
			System.err.println("Caught exception. Msg: " + e);
			return null;
		}
	}
}
