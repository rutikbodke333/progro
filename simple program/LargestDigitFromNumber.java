import java.util.*;
public class LargestDigitFromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        int largestDigit = 0;
        while (n != 0) {
            digit = n %10;
            if(digit > largestDigit){
                largestDigit = digit;
            }
            n = n / 10;
            
        }
        System.out.println(largestDigit);
    }
}
