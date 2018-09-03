package com.caps.beta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.caps.beta.dto.Movie;
import com.mysql.jdbc.Driver;

public class StoreMovieUsingJDBC {
	public static void main(String[] args) {
		System.out.println("Enter a Movie Name: ");
		Scanner in = new Scanner(System.in);
		Movie m = new Movie();
		m.setName(in.nextLine());
		System.out.println("Enter movie ID: ");
		m.setMovieId(Integer.parseInt(in.nextLine()));
		System.out.println("Enter movie Summery: ");
		m.setSummery(in.nextLine());
		System.out.println("Enter the Rating: ");
		m.setRating(Double.parseDouble(in.nextLine()));
		
		new StoreMovieUsingJDBC().save(m);
		
		
	}
	
	
	public void save(Movie movie) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			 //1. Load the Driver
			java.sql.Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			
			//2. get the DB connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/caps50_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			
			//3. Issue the SQL query via connection
			String query = "INSERT INTO movie_info values(?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, movie.getMovieId());
			pstmt.setString(2, movie.getName());
			pstmt.setString(3, movie.getSummery());
			pstmt.setDouble(4, movie.getRating());
			
			int count = pstmt.executeUpdate();
			
			//4. Process the results
			if(count > 0) {
				System.out.println("Data Inserted Successfully");
			}else {
				System.out.println("Failed to Insert Data");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//5. Closing all the JDBC Objects
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}















