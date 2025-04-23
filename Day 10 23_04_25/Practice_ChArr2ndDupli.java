// character Array 2nd duplicate letter
public class Practice_ChArr2ndDupli {
    
    public static void main(String[] args) {
        String str = "helloh";
        char[] ch = str.toCharArray();
        int count=0;
        
        for(int i=0; i < ch.length; i++) {
            for(int j=i+1;j<ch.length;j++) {
                if(ch[i] == ch[j]) {
                    if(count==1) {
                        System.out.print(ch[i]);
                        return;
                    }
                    count++;
                }
            }
            
        }
    }
    
}