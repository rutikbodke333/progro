import java.util.Scanner;

public class sum_digit_of_even_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int digit = 0;
        int sum = 0;

        while (num != 0) {
            digit = num % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
                System.out.println("Sum of even no: " + sum);

            }
            num = num / 10;

        }
    }
}
