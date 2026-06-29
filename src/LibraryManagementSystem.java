import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add New Book");
            System.out.println("2. Register New Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Display Available Books");
            System.out.println("5. Search Books");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Display All Members");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n===== ADD NEW BOOK =====");

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    Book book = new Book(isbn, title, author, genre);
                    library.addBook(book);

                    break;

                case 2:

                    System.out.println("\n===== REGISTER MEMBER =====");

                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();

                    Member member = new Member(memberId, name, contact);
                    library.addMember(member);

                    break;

                case 3:

                    library.displayAllBooks();
                    break;

                case 4:

                    library.displayAvailableBooks();
                    break;

                case 5:

                    System.out.print("Enter Title or Author: ");
                    String keyword = sc.nextLine();

                    library.searchBooks(keyword);

                    break;

                case 6:

                    System.out.println("\n===== BORROW BOOK =====");

                    System.out.print("Enter Member ID: ");
                    String borrowMemberId = sc.nextLine();

                    System.out.print("Enter Book ISBN: ");
                    String borrowIsbn = sc.nextLine();

                    library.borrowBook(borrowMemberId, borrowIsbn);

                    break;

                case 7:

                    System.out.println("\n===== RETURN BOOK =====");

                    System.out.print("Enter Member ID: ");
                    String returnMemberId = sc.nextLine();

                    System.out.print("Enter Book ISBN: ");
                    String returnIsbn = sc.nextLine();

                    library.returnBook(returnMemberId, returnIsbn);

                    break;

                case 8:

                    library.displayAllMembers();

                    break;

                case 9:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}
