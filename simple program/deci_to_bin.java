// WAP to convert decimal to binary
import java.util.*;
public class deci_to_bin {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    String binary = "";
    while (n != 0) {
        int remainder = n % 2;
        binary = remainder + binary; // 0 + "1" ---> 01 
        n = n / 2; 

    }
    System.out.println(binary);
    System.out.println( "01" + 1);
   } 
   
}
