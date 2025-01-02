import java.util.*;

public class digit_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int digit = 0;
        

        while (num != 0) {
            digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}
