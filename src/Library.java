import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully!");
    }

    // Add Member
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member Registered Successfully!");
    }

    // Find Book by ISBN
    public Book findBookByIsbn(String isbn) {

        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }

        return null;
    }

    // Find Member by ID
    public Member findMemberById(String memberId) {

        for (Member member : members) {
            if (member.getMemberId().equalsIgnoreCase(memberId)) {
                return member;
            }
        }

        return null;
    }

    // Display All Books
    public void displayAllBooks() {

        System.out.println("\n===== ALL BOOKS =====");

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Display Available Books
    public void displayAvailableBooks() {

        System.out.println("\n===== AVAILABLE BOOKS =====");

        boolean found = false;

        for (Book book : books) {

            if (book.isAvailable()) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books available.");
        }
    }

    // Search by Title or Author
    public void searchBooks(String keyword) {

        System.out.println("\n===== SEARCH RESULT =====");

        boolean found = false;

        keyword = keyword.toLowerCase();

        for (Book book : books) {

            if (book.getTitle().toLowerCase().contains(keyword)
                    || book.getAuthor().toLowerCase().contains(keyword)) {

                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book Not Found!");
        }
    }

    // Borrow Book
    public void borrowBook(String memberId, String isbn) {

        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member == null) {
            System.out.println("Member Not Found!");
            return;
        }

        if (book == null) {
            System.out.println("Book Not Found!");
            return;
        }

        if (member.borrowBook(book)) {
            System.out.println("Book Borrowed Successfully!");
            System.out.println("Member : " + member.getName());
            System.out.println("Book   : " + book.getTitle());
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Return Book
    public void returnBook(String memberId, String isbn) {

        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member == null) {
            System.out.println("Member Not Found!");
            return;
        }

        if (book == null) {
            System.out.println("Book Not Found!");
            return;
        }

        if (member.returnBook(book)) {
            System.out.println("Book Returned Successfully!");
        } else {
            System.out.println("This member did not borrow the book.");
        }
    }

    // Display All Members
    public void displayAllMembers() {

        System.out.println("\n===== MEMBERS =====");

        if (members.isEmpty()) {
            System.out.println("No members found.");
            return;
        }

        for (Member member : members) {
            member.displayMember();
        }
    }
}
