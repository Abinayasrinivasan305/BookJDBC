package jdbcvalidation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;
public class AddBook {
	public static void addBook(Scanner d) throws SQLException {
        System.out.println("Enter book number:");
        int bno = d.nextInt();
        System.out.println("Enter the name of the book:");
        String bname = d.next();
        d.nextLine();
        System.out.println("Enter book price");
        float bprice = d.nextFloat();
        d.nextLine();
        String query = "INSERT INTO book(bno, bname, bprice) VALUES(?, ?, ?)";
        try (Connection con = Dbconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
        	ps.setInt(1, bno);
            ps.setString(2,bname);
            ps.setFloat(3,bprice);

            ps.executeUpdate();
            System.out.println("Book inserted Successfully!!");
        } 
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Book already exists.");
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Book already exists.");
        }
    }
}

