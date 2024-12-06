package CoreJavaConcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String dbURL = "jdbc:mysql://localhost:/synechrondatabase";
	String username = "root";
	String password = "root";
	//load the my sql jdbc driver - jar file included
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//create connection to the database
	Connection con = DriverManager.getConnection(dbURL, username, password);
	
	//create the statement object
	Statement st = con.createStatement();
	
	String selectquery = "select * from Persons";
	//Result set is used to eecute the query
	ResultSet rs = st.executeQuery(selectquery);
	System.out.println(rs);
	while(rs.next()) {
		System.out.println(rs.getString("PersonID"));
		System.out.println(rs.getString("FirstName"));
		System.out.println(rs.getString("LasttName"));
		System.out.println(rs.getString("City"));
	}
	

	}

};

