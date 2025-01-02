// Binary to deci
// deci to  oct
import java.util.*;
public class bin_to_oct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1110;
        int sum = 0;
        int power = 0;


        while (n != 0) {
            int d = n % 10;
            sum = sum + d * pow(2, power);
            power++;
            n = n / 10;
            
        }
        int deci = sum;

        while (n != 0) {
            int d = n % 2;
            

            
        }

        




    }

    public static int pow(int n , int p) {
        int prod = 1;
        for(int i = 1; i <= p; i++){
           prod = prod * n;
        }
        return prod;
    }
}
