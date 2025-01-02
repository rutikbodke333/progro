import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input ");
        int n = sc.nextInt();
        int reverseDigit = 0;
        int temp = n;

        while(n != 0){
            int digit = n % 10;
            reverseDigit = reverseDigit * 10 + digit;
            n = n /10;

        }
        if(temp == reverseDigit){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Plaindrome Number");
        }

    }
}
