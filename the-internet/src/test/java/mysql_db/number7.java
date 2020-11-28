package mysql_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class number7 {
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
							+ "SELECT inventory_id FROM inventory WHERE inventory.film_id = (SELECT film_id FROM film WHERE film.title = 'Alien Center') AND inventory.store_id = 2");
			
			
//			SELECT inventory_id
//			FROM inventory
//			WHERE inventory.film_id = (
//				SELECT film_id
//			    FROM film
//			    WHERE film.title = 'Alien Center') AND inventory.store_id = 2;
			
			//4. Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("inventory_id"));
			}
			
			
			
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
