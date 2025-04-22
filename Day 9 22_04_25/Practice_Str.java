
public class Practice_Str {
    
    public static void main(String[] args) {
        String str= "Hello";
        System.out.println(str);
        
        // Length of a String
        System.out.println("Length: " + str);
        
        // Printing Each String Character
        for(int i = 0 ; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        
        System.out.println("Reversed: ");
        for(int i = str.length()-1 ; i >= 0; i--){
            System.out.print(str.charAt(i) + " ");
        }
        
        
    }
    
}