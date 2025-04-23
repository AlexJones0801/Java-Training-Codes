
public class Practice_StrPrintFirstRC {
    
    public static void main(String[] args) {
        String str="Hellooooo", newStr="";
        for(int i =0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(newStr.indexOf(ch) == -1){
                newStr += ch;
            } else {
                System.out.println(ch);
                break;
            }
        }
        System.out.println(newStr);
    }
    
}