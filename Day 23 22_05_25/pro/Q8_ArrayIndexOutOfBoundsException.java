// Q8. Create a try-catch block that handles ArrayIndexOutOfBoundsException when accessing an array element out of range.

package pro;

public class Q8_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        try {
            System.out.println(arr[6]);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
            // System.out.println(e);
        }

        System.out.println("End of program");
    }
}
