
public class PracticeStringCompress {
    
    public static void main(String[] args) {
        String str = "aaabbccccddddd";
        StringBuilder newStr = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                // System.out.println(str.charAt(i));
            } else {
                newStr.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        newStr.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(newStr);
    }
}