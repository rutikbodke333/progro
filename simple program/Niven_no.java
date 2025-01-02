
// WAP to check if has the number is a Niven Number (Harshad Number) or not
// A harshad Number is a number which is divisible by sum of it's digit.
import java.util.*;

public class Niven_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the input");
       int n = sc.nextInt();
       int m = n;
       int sum=0;
       while (n !=0){
        int digit=n%10;
        sum = sum + digit;
        n=n/10;
       } 
       if(m%sum ==0){
          System.out.println("niven number");
       }
    }

}
