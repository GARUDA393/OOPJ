import java.util.*;

class Book {
    int id;
    String name, author;

    Book(int i, String n, String a) {
        id = i;
        name = n;
        author = a;
    }

    void display() {
        System.out.println("Book Info : " + id + " " + name + " " + author);
    }
}

class ArrayListMain {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java", "Schildt");
        Book b2 = new Book(3, "C", "Ritchie");
        Book b3 = new Book(2, "C#", "Schildt");
        ArrayList<Book> a = new ArrayList<>();
        a.add(b1);
        a.add(b2);
        a.add(b3);
        Iterator<Book> itr = a.iterator();
        while (itr.hasNext()) {
            Book b = itr.next();
            b.display();
        }
        // To retrieve a book randomly from the list
        Book c = a.get(1);
        System.out.println(c.id + " " + c.name + " " + c.author);
    }
}