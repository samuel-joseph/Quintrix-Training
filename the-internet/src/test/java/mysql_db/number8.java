package mysql_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class number8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			

			
			//1. Get connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "pINANGAY-7");
			
			
			String transaction = "START TRANSACTION";
			String insert1 = "INSERT INTO staff(first_name, last_name, address_id, email, store_id, active, username) VALUES('John', 'Doe', '18', 'rogo@gmail.com', '2', '1', 'newJohnD')";
			String set1 = "SET @staffId = LAST_INSERT_ID()";
			String insert2 = "INSERT INTO address(address, district, city_id, phone, location)VALUES('110 Main', \"Diner Bot\", 200, 9000, ST_GeomFromText('POINT(1 1)'))";
			String set2 = "SET @addressId = LAST_INSERT_ID()";
			String insert3 = "INSERT INTO store(manager_staff_id, address_id)VALUES(@staffId, @addressId)";
			String set3 = "SET @storeId = LAST_INSERT_ID()";
			String update = "UPDATE staff";
			String setA = "SET store_id = @storeId";
			String where = "WHERE staff_id = @staffId";
			String rollback = "ROLLBACK";
			
			myConn.setAutoCommit(false);
			
			//2. Create Statement
			Statement myStatement = myConn.createStatement();
			
			myStatement.addBatch(insert1);
			myStatement.addBatch(insert2);
			
			//3. Execute SQL query
			ResultSet myRs = myStatement.executeQuery(transaction);
			myStatement.executeUpdate(insert1);
			myStatement.executeQuery(set1);
			myStatement.executeUpdate(insert2);
			myStatement.executeQuery(set2);
			myStatement.executeUpdate(insert3);
			myStatement.executeQuery(set3);
			myStatement.executeUpdate(update);
			myStatement.executeQuery(setA);
			myStatement.executeQuery(where);
			myStatement.executeQuery(rollback);
			
			
			
			
			
			
			
			
			
			
			
//			SELECT inventory_id
//			FROM inventory
//			WHERE inventory.film_id = (
//				SELECT film_id
//			    FROM film
//			    WHERE film.title = 'Alien Center') AND inventory.store_id = 2;
			
			//4. Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString(""));
			}
			
			
			
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}