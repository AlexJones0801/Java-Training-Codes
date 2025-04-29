
public class Practice_StringSort {
    
    public static void main(String[] args) {
        String[] str = {"A","E","C","B"};
        for(int i=0;i<str.length-1;i++) {
            for(int j=0;j<str.length-i-1;j++) {
                if((int)str[j].charAt(0)>(int)str[j+1].charAt(0)) {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
            }
            }
        }
        
        for(int i =0 ;i < str.length;i++) {
            System.out.print(str[i] + " ");
        }
        
    }
    
}