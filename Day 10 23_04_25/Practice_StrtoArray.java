
public class Practice_StrtoArray {
    
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();
        
        for(int i=0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
    
}