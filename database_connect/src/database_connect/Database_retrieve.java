package database_connect;

import java.sql.*;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Database_retrieve {

  	final static String url = "jdbc:mariadb://localhost/Maseno";
    final static  String password = "0220";
    final static String username = "root"; 
    
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			try {
			    Connection connect = DriverManager.getConnection(url,username,password);
			    Statement statement = connect.createStatement();
			    String query = "select * from Students";
			    ResultSet result = statement.executeQuery(query);

			    while (result.next()) {
			    	System.out.println("Adm_no  :  " +result.getString("Admission_no") +"  \n  Name  :  "+result.getString("Name"));
			    	
			    }
			    
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
	}

}
