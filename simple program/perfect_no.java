import java.util.Scanner;

public class perfect_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum_of_factrors = 0;
        System.out.println("Enter the input");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum_of_factrors = sum_of_factrors + i;

            }
        }
        if(n == sum_of_factrors){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

    }
}
