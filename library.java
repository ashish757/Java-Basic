import java.util.Arrays;

class OnlineLibrary {
    private String[] books = new String[]{"a", "b", "c", "d"};

    private String[] borrowedBooks = new String[4];

    private String[] avaliableBooks = books.clone();

    OnlineLibrary() {

    }
    // show All books
    public String [] getBooks() {
        return books;
    }

    // show avaliable books
    public String [] getAvaliableBooks() {
        return avaliableBooks;
    }
    // show borowed books
    public String [] borrowedBooks() {
        return borrowedBooks;
    }

    // borrow book
    public void borrowBook(String bookName) {
        // if book exists in borrowed books return 
        for(String book: this.borrowedBooks) {
            if (book == bookName) {
                System.out.println(bookName + " has issued already borrowed");
                return;
            }
        }

        // if book exists in avaliable book allocate the book
        for(int i = 0; i < avaliableBooks.length; i++) {
            if (avaliableBooks[i] == bookName) {
                for(int j = 0; j < borrowedBooks.length; j++) {
                    if (borrowedBooks[j] == null) {
                        borrowedBooks[j] = avaliableBooks[i];
                        break;
                    }
                }
                
                avaliableBooks[i] = null;
                
                System.out.println(bookName + " has been issued for you.");
                return;
            }
        }

        // does'nt exists in avaliable book then
        System.out.println("we don't have this (" + bookName + ") book");
        return;
    }
    // return book
    public void returnBook(String bookName) {
        // if book exists in borrowed books return 
        for(int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == bookName) {

                for(int j = 0; j < avaliableBooks.length; j++) {
                    if (avaliableBooks[j] == null) {
                        avaliableBooks[j] = borrowedBooks[i];
                        break;
                    }
                }

                borrowedBooks[i] = null;
                System.out.println(bookName + " has been returned now.");
                return;
            }
        }

        System.out.println("This (" + bookName + ") book has not been borrowed yet.");
    }

    public void getStatus() {
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("All Books : " + Arrays.toString(books));
        System.out.println("Avaliable Books : "+ Arrays.toString(avaliableBooks));
        System.out.println("Borrowed Books : "+ Arrays.toString(borrowedBooks));
        System.out.println("----------------------------------------------");
        System.out.println();
    }
}

class Library {
    public static void main(String[] args) {
        OnlineLibrary  lib = new OnlineLibrary();

        lib.getStatus();
        lib.borrowBook("a");
        lib.borrowBook("c");

        lib.returnBook("c");
        lib.returnBook("a");
        lib.borrowBook("d");
        lib.getStatus();
    }
}