package jdbcvalidation;
import java.sql.SQLException;
import java.util.Scanner;
public class Main1 {
	 public static void main(String[] args) throws SQLException {
	        Scanner d = new Scanner(System.in);

	        while (true) {
	            try {
	                System.out.println("1. Add Books");
	                System.out.println("2. Update Books");
	                System.out.println("3. Delete Books");
	                System.out.println("4. View all Books");
	                System.out.println("5. Exit");
	                System.out.println("Enter your choice");

	                int ch = d.nextInt();
	                d.nextLine();
	                switch (ch) {
	                    case 1:
	                        AddBook.addBook(d);
	                        break;
	                    case 2:
	                        UpdateBook.updateBook(d);
	                        break;
	                    case 3:
	                        DeleteBook.deleteBook(d);
	                        break;
	                    case 4:
	                        ViewBooks.viewBooks();
	                        break;
	                    case 5:
	                        System.out.println("Exiting...");
	                        d.close();
	                        return;
	                    default:
	                        System.out.println("Invalid Choice");
	                        break;
	                }
	            } catch (Exception e) {
	                System.out.println("Invalid input, please enter a number within the range");
	            }
	        }
	 }
}
