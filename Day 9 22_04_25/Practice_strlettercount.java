// Count each character count 
public class Practice_strlettercount {
    
    public static void main(String[] args) {
        String str = "hello";
        String checked = ""; // stores already counted character
        
        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Skips if already counted
            if(checked.indexOf(ch) != -1) 
                continue;
            
            int count = 0;
            
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch)
                    count++;
            }
            
            System.out.println(ch + ": " + count);
            checked += ch;   // marks as counted
        }
        
    }
    
}