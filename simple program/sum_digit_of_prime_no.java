import java.util.*;

public class sum_digit_of_prime_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NUmber");
        int n = sc.nextInt();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            if(digit == 2 || digit == 3 || digit == 5 || digit == 7 ){
                //sum = sum + digit;
                System.out.println(digit);
            }
            
            n = n / 10;

        }

        //System.out.println(sum);

    }
}
