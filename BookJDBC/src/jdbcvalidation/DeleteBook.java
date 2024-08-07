package jdbcvalidation;
import java.sql.*;
import java.util.*;
public class DeleteBook {
	 public static void deleteBook(Scanner d) throws SQLException {
	        System.out.println("Enter Book number to Delete:");
	        int bnum = d.nextInt();
	        d.nextLine();
	        String query = "DELETE FROM book WHERE bno = ?";
	        
	        Connection con = Dbconnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
	        Statement st1=con.createStatement();
	    
	        	try	{
	            
	            String squery="select * from book";
	            ResultSet rs = st1.executeQuery(squery);
	            boolean isExist=false;
	            while(rs.next()) {
	            	int bno=rs.getInt(1);
	            	if(bno==bnum) {
	            		 ps.setInt(1, bnum);
	            		 ps.executeUpdate();
	            		 isExist=true;
	                     System.out.println("Book deleted Successfully!!");
	            	}
	            }
	           if(!isExist) {
	        	   System.out.println("No such book exist");
	           }
	        } catch (SQLException e) {
	            System.out.println(e);
	        }
	    }
}
