import java.util.*;
public class Q4_VowelsNConsonant {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = in.next().charAt(0);
        
        if(ch>'a' && ch<'z' || ch>'A' && ch=='Z'){
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.print("Vowels");
            break;
            
            default:
            System.out.print("Consonant");
            break;
        }
        } else {
            System.out.print("Invalid Character");
        }
    }
    
}