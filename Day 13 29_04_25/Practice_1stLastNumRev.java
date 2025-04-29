
public class Practice_1stLastNumRev {
    
    public static void main(String[] args) {
        int num=14237535,last=0,rev=0,count=0;
        last = num%10;
        while(num>0) {
            int digits = num%10;
            rev = rev*10+digits;
            count++;
            num /= 10;
        }
        int first = rev%10;
        num = last;
        while(count>2){
            rev /= 10;
            int digits = rev %10;
            num = num * 10 + digits;
            count--;
            
        }
        num = num * 10 + first;
        System.out.println(num);
    }
    
}