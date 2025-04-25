
public class Practice_StringBuilder {
    
    public static void main(String[] args) {
        // Example of Immutable String
        System.out.println("\nExample of Immutable String");
        String st = "hello";
        System.out.println(st.concat("hii"));
        System.out.println(st);
        
        // Example of Mutable String
        System.out.println("\nExample of Mutable String");
        StringBuilder str = new StringBuilder(10);
        str.append("hii");
        System.out.println(str.length());
        System.out.println(str);
        
        
        // capacity example
        System.out.println("\nStringBuilder Capacity example");
        StringBuilder str2 = new StringBuilder(5);
        str2.append("helloj");
        System.out.println(str2.length());
        System.out.println(str2.capacity());
        
    }
    
}