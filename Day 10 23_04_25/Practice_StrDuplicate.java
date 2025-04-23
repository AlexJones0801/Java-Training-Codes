
public class Practice_StrDuplicate {
    
    public static void main(String[] args) {
        String str="Hello", newStr="";
        for(int i =0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(newStr.indexOf(ch) == -1)
                newStr += ch;
        }
            
        System.out.println("New String: " + newStr);
    }
    
}