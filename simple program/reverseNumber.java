import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input ");
        int n = sc.nextInt();
        int reverseDigit = 0;

        while(n != 0){
            int digit = n % 10;
            reverseDigit = reverseDigit * 10 + digit;
            n = n /10;

        }
        System.out.println(reverseDigit);

        
    }
}
