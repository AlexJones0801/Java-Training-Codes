// character Array first duplicate letter
public class Practice_ChArrDuplicate {
    
    public static void main(String[] args) {
        String str = "helloh";
        char[] ch = str.toCharArray();
        
        for(int i=0; i < ch.length; i++) {
            for(int j=i+1;j<ch.length;j++) {
                if(ch[i] == ch[j]) {
                    System.out.print(ch[i]);
                    return;
                }
            }
            
        }
    }
    
}