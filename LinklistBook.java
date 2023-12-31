import java.util.LinkedList;
import java.util.List;

public class LinklistBook {
    public static void main(String[] args) {
        
        List<book> list = new LinkedList<book>();

        book b1 = new book(101, "Coding", "Alok Sharma", "Cotmac", 1000);
        book b2 = new book(102, "java Coding", "rocky", "hero", 2000);
        book b3 = new book(103, "python codeing", "salman", "Kandhari", 100);
        book b4 = new book(104, "C++ Coding", "Arun", "Gates", 5000);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

         // Print table header
         System.out.println("+----+-------------+--------------+----------------+-----+");
         System.out.println("| ID |    Name     |    Author    |    Publisher   | Qty |");
         System.out.println("+----+-------------+--------------+----------------+-----+");
 
         // Print table data
         for (book b : list) {
             System.out.printf("| %2d | %-12s | %-13s | %-14s | %3d |\n", b.id, b.name, b.Author, b.publisher, b.qty);
         }
 
         // Print table footer
         System.out.println("+----+-------------+--------------+----------------+-----+");
     }
    
}

class book{
    int id;
    String name, Author, publisher;
    int qty;

    public book(int id, String name, String author, String publisher, int qty) {
        this.id = id;
        this.name = name;
        Author = author;
        this.publisher = publisher;
        this.qty = qty;
    }

    
}
