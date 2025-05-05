//Q8 Write a program where you overload a method display in such a way that it can print an array of integers, an array of strings, and a 2D array of integers.
class Array {
    void display(int[] arr){
        System.out.print("1D integer Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    void display(String[] arr){
        System.out.print("1D String Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    void display(int[][] arr){
        System.out.println("2D Integer Array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Q8_method2darr {
    public static void main(String[] args) {
        Array ary = new Array();

        int[] arr = {2,4,5,8,12,15,16};
        ary.display(arr);

        String[] arrStrings = {"God","of","War","Ragnarok"};
        ary.display(arrStrings);

        int[][] arr2D = {{2,4,5,},{8,12,15},{16,18,22}};
        ary.display(arr2D);
    }
}