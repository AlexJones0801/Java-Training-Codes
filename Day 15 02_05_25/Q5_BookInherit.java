// Single Level Inheritance

class Book {
    void read() {
        System.out.println("Opening book..");
    }
}

class Novel extends Book {
    void storyLine() { 
        System.out.println("Once upon a time");
    }
}

public class Q5_BookInherit {
    
    public static void main(String[] args) {
        Novel n = new Novel();
        
        n.read();
        n.storyLine();
    }
    
}