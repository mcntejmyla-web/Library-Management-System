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
    }

    // Add Member
    public void addMember(Member member) {
        members.add(member);
    }

    // Find Book by ISBN
    public Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Find Member by ID
    public Member findMember(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    // Display All Books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Display All Members
    public void displayMembers() {

        if (members.isEmpty()) {
            System.out.println("No members available.");
            return;
        }

        for (Member member : members) {
            member.displayMember();
        }
    }

    // Search Book
    public void searchBook(String keyword) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {

                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Borrow Book
    public void borrowBook(String memberId, String isbn) {

        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member == null || book == null) {
            System.out.println("Invalid Member ID or ISBN.");
            return;
        }

        if (member.borrowBook(book)) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Return Book
    public void returnBook(String memberId, String isbn) {

        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member == null || book == null) {
            System.out.println("Invalid Member ID or ISBN.");
            return;
        }

        if (member.returnBook(book)) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }
}
