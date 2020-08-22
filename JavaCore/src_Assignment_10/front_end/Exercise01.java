package front_end;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise01 {

	public static void main(String[] args) throws SQLException{
		
		String dbUrl = "jdbc:mysql://localhost:3306/testingsystem";
		String username = "root";
		String password = "123pass";
		
		Connection con = DriverManager.getConnection( dbUrl, username, password);
		System.out.println("Connect success!");
		
		Statement statement = con.createStatement();
		String lenhSql1 = "Select * From position";
		
		statement.executeQuery(lenhSql1);
		
		ResultSet result1 = statement.executeQuery(lenhSql1);
		
		while(result1.next()) {
		System.out.println(result1.getString("PositionID"));
		System.out.println(result1.getString("PositionName"));
		}
	}
}