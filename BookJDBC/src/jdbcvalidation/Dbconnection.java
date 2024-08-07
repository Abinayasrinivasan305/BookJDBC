package jdbcvalidation;
import java.sql.*;
public class Dbconnection {

		// TODO Auto-generated method stub
	
	
	    static String url = "jdbc:mysql://localhost:3306/booksdb";
	    static String user = "root";
	    static String pwd = "root";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(url, user, pwd);
	    }


}
