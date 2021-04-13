package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcMysql {

	public static void main(String[] args) throws Exception {
		
		
		
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "admin123");
		
		Statement stmt1 = con.createStatement();
		
		String s = "INSERT INTO `payment_methods` VALUES (5,'paytm Transfer')";
		
		stmt1.execute(s);
		
		con.close();
		
		System.out.println("connection closed");
		

	}

}
