class Book {
    String title,author;
    double price;
    
    Book(String t,String a,double p) {
        this.title = t;
        this.author = a;
        this.price = p;
    }
    
    void Discount(){
        double discount = price * 0.10;
        double finalPrice = price - discount;
        
        System.out.println("Original Price: $" + price);
        System.out.println("After 10% Discount: $" + discount);
        System.out.println("Final Price: " + finalPrice);
    }
    
    void bookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Q6_Book {
    
    public static void main(String[] args) {
        Book bk = new Book("Java Programming","John Smith",60);
        
        bk.bookDetails();
        bk.Discount();
    }
    
}