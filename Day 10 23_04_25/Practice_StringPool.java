
public class Practice_StringPool {
    
    public static void main(String[] args) {
        String str="hello";
        String str1="hello";
        System.out.println(str==str1);
        
        String str2="eye";
        str2="hello";
        System.out.println(str2);
        
        String str3= new String("hello");
        String str4= new String("hello");
        System.out.println(str3==str4);
    }
    
}