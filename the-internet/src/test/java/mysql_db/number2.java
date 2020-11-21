package mysql_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//1. Get connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "pINANGAY-7");
			
			//2. Create Statement
			Statement myStatement = myConn.createStatement();
			
			//3. Execute SQL query
			ResultSet myRs = myStatement
					.executeQuery(""
							+ "SELECT * "
							+ "FROM sakila.film WHERE title LIKE '%airplane%'");
			
			//4. Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("film_id") 
						+ ","+myRs.getString("title")
						+ ","+myRs.getString("release_year")
						+","+myRs.getString("language_id")
						+","+myRs.getString("original_language_id")
						+","+myRs.getString("rental_duration")
						+","+myRs.getString("rental_rate")
						+","+myRs.getString("length")
						+","+myRs.getString("replacement_cost")
						+","+myRs.getString("rating")
						+","+myRs.getString("special_features")
						+","+myRs.getString("last_update"));
			}
			
			
			
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
