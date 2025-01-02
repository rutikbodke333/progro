import java.util.Scanner;

public class p1000 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        int sum = 0;
        // finding a length
        while (n != 0) {

            n = n / 10;
            count++;

        }
        int m = count;
        // finding the power
        n = temp;
        while (n != 0) {
            // find the d
            int digit = n % 10;
            // cal power
            int power = 1;

            for(int i = 1; i <= m; i++){
                power = power * digit;
            }
           System.out.println("power" +  power);
            sum = sum + power;

            n = n / 10;
        }
System.out.println("sum" +  sum);
        if(temp == sum){
            System.out.println("Amstrong num");
        }
        else{
            System.out.println("not a amstrong number");
        }

    }
}
