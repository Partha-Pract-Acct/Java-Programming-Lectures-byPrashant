/*
Create a Book class for a library system.
      Instance variables: title, author, isbn.
      Static variable: totalBooks, a counter for the total number of book instances.
      Instance methods: borrowBook(), returnBook().
      Static method: getTotalBooks(), to get the total number of books in the library.
 */

public class _49_Book {

    static int totalNoOfBooks;

    String author;
    String title;
    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }

    _49_Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    _49_Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if(isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy! " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
    }


    public static void main(String[] args) {
        _49_Book designOfThings = new _49_Book("1", "Design", "Author");
        _49_Book myBook = new _49_Book("2");
        System.out.println(_49_Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}
