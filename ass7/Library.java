class Library {

    int[] bookId = new int[100];
    String[] bookName = new String[100];
    String[] author = new String[100];

    int count = 0;

    void addBook(int id, String name, String auth) {

        bookId[count] = id;
        bookName[count] = name;
        author[count] = auth;

        count++;
    }

    void removeBook(int id) {

        int index = -1;

        for (int i = 0; i < count; i++) {
            if (bookId[i] == id) {
                index = i;
                break;
            }
        }

        
        if (index == -1) {
            System.out.println("Book not found");
            return;
        }


        for (int i = index; i < count - 1; i++) {
            bookId[i] = bookId[i + 1];
            bookName[i] = bookName[i + 1];
            author[i] = author[i + 1];
        }

        count--;

        System.out.println("Book removed");
    }

    void display() {
        System.out.println("Books in the library:");

        for (int i = 0; i < count; i++) {
            System.out.println(
                bookId[i] + " " +
                bookName[i] + " " +
                author[i]
            );
        }
    }


    public static void main(String[] args) {

        Library l = new Library();

        l.addBook(101, "Java", "James");
        l.addBook(102, "DBMS", "Korth");
        l.addBook(103, "C++", "Bjarne");

       // System.out.println("Before removing:");
        l.display();

        l.removeBook(102);

        System.out.println("After removing:");
        l.display();
    }
}
