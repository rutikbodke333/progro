import java.util.Scanner;

public class sum_of_even_odd_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int digit = 0;
        int sum = 0;
        int sum02 = 0;

        while (num != 0) {
            digit = num % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;

            } else {
                sum02 = sum02 + digit;
            }

            num = num / 10;

        }

        System.out.println("Sum of odd no: " + sum02);

        System.out.println("Sum of even no: " + sum);
    }
}
