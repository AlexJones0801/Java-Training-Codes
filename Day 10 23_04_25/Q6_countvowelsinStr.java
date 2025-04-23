// Count vowels in a string
public class Q6_countvowelsinStr {
    
    public static void main(String[] args) {
        String name = "Shivansh Kurmi";
        char[] ch = name.toLowerCase().toCharArray();
        int count=0;
        
        for(int i=0; i < ch.length;i++) {
            if("aeiou".indexOf(ch[i]) != -1)
                count++;
        }
        
        System.out.println("Vowels count: " + count);
    }
    
}