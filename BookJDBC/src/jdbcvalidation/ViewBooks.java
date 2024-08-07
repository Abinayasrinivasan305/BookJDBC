package jdbcvalidation;
import java.sql.*;
public class ViewBooks {
	 public static void viewBooks() throws SQLException {
	        try (Connection con = Dbconnection.getConnection();
	             Statement st = con.createStatement()) {
	            String query = "SELECT * FROM book";
	            ResultSet rs = st.executeQuery(query);
	            System.out.println("The Books are:");
	            System.out.println("**********************************************");
	            while (rs.next()) {
	                System.out.println("Book number: " + rs.getInt(1));
	                System.out.println("Book Name: " + rs.getString(2));
	                System.out.println("Book price: " + rs.getFloat(3));
	                System.out.println("**********************************************");
	            }
	        } catch (SQLException e) {
	            System.out.println("Unable to view Students Details");
	        }
	    }
}
