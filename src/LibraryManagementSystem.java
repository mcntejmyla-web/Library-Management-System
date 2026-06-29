import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Display All Members");
            System.out.println("5. Search Book");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    library.addBook(new Book(isbn, title, author, genre));

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:

                    System.out.print("Enter Member ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();

                    library.addMember(new Member(id, name, contact));

                    System.out.println("Member Registered Successfully!");
                    break;

                case 3:

                    library.displayBooks();
                    break;

                case 4:

                    library.displayMembers();
                    break;

                case 5:

                    System.out.print("Enter Title or Author: ");
                    String keyword = sc.nextLine();

                    library.searchBook(keyword);
                    break;

                case 6:

                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();

                    System.out.print("Enter Book ISBN: ");
                    String bookId = sc.nextLine();

                    library.borrowBook(memberId, bookId);
                    break;

                case 7:

                    System.out.print("Enter Member ID: ");
                    String memberId2 = sc.nextLine();

                    System.out.print("Enter Book ISBN: ");
                    String bookId2 = sc.nextLine();

                    library.returnBook(memberId2, bookId2);
                    break;

                case 8:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}
