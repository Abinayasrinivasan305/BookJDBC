package jdbcvalidation;
import java.sql.*;
import java.util.Scanner;

public class UpdateBook {
	 public static void updateBook(Scanner d) throws SQLException {
	        System.out.println("Enter Book no to update");
	        int bnumber = d.nextInt();
	        System.out.println("Enter that book price to update");
	        float price = d.nextFloat();
	        d.nextLine();
	        Connection con = Dbconnection.getConnection();
	        Statement set=con.createStatement();
			String query1="select * from book";
			ResultSet rs=set.executeQuery(query1);

	        String query = "UPDATE book SET bprice = ? WHERE bno = ?";
	        PreparedStatement ps = con.prepareStatement(query);
	        try {
                 boolean bookexist=false;
	        	while(rs.next()) {
					int num=rs.getInt(1);
					if(bnumber==num) {
						ps.setFloat(1, price);
						ps.setInt(2,bnumber);
						ps.executeUpdate();
						System.out.println("Student updated Successfully!!");
						bookexist=true;
						ps.close();
						break;
						
					}
	        	}
	        	if(!bookexist) {
	        		System.out.println("No such book exists!!!!!");
	        	}
	            
	        } catch (SQLException e) {
	            System.out.println(e);
	        }
	    }

}
