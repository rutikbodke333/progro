import java.util.*;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
               count++;

            }
        }
        if(count == 2){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
