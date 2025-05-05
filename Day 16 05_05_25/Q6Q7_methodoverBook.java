// Q6 Design a class Book with overloaded methods to display book details in different formats.
// Q7 One method should display the title and author, and another should display the title, author, and price.

class Books {
    void displayDetails(String Book) {
        System.out.println("Book 1: " + Book);
    }

    void displayDetails(String Book, String author) {
        System.out.println("Book 2: " + Book + "\nAuthor: " + author);
    }

    void displayDetails(String Book, String author, double price) {
        System.out.println("Book 3: " + Book + "\nAuthor: " + author + "\nPrice:$ " + price);
    }

}

public class Q6Q7_methodoverBook {
    public static void main(String[] args) {
        Books bk = new Books();

        bk.displayDetails("Java Book");
        bk.displayDetails("Effective Java", "Joshua Bloch");
        bk.displayDetails("Modern Java in Action", "Raoul-Gabriel Urma, Mario Fusco, and Alan Mycroft", 59.56);
    }
}