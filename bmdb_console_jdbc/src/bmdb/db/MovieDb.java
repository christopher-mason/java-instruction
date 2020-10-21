package bmdb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bmdb.business.Actor;
import bmdb.business.Movie;

public class MovieDb {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "bmdb_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		
		return connection;
	}
	
	public List<Movie> getAll() {
		
		List<Movie> movieList = new ArrayList<>();
		
		try  (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet movies = stmt.executeQuery("SELECT * FROM Actor");) {
			
			while (movies.next()) {
				long id = movies.getLong("ID");
				String title = movies.getString("FirstName");
				String year = movies.getString("LastName");
				String rating = movies.getString("Gender");
				String director = movies.getString("BirthDate");
				
				Movie movie = new Movie(id, title, year, rating, director);
				
				movieList.add(movie);			
			}
			} catch (SQLException e) {
				System.err.println("Caught exception. Msg: " + e);
				return null;
			}
		return movieList;
	}
	
	public Movie get(String title) {
		
		String movieSelect = "SELECT * FROM MOVIE WHERE title ='" + title + "'";
		
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet movies = stmt.executeQuery(movieSelect);) {
			
			if (movies.next()) {
				long id = movies.getLong("ID");
				String movieTitle = movies.getString("FirstName");
				String year = movies.getString("LastName");
				String rating = movies.getString("Gender");
				String director = movies.getString("BirthDate");
				
				Movie movie = new Movie(id, movieTitle, year, rating, director);
				
				return movie;
			} else {
				return null;
			}
				
		} catch (SQLException e) {
			System.err.println("Caught exception. Msg: " + e);
			return null;
		}
	}
}
