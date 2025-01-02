import java.util.*;

public class p4 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Number: ");
      int n = sc.nextInt();
      int sum = 0;
      int fact = 0;
      int sum_of_fact = 0;
      int temp = n;

      while (n != 0) {
         int last_digit = 0;
         last_digit = n % 10;
         for(int i = 1; i <=  last_digit; i ++){
            fact = fact * i;
         }
         sum_of_fact += fact;
         n = n/10;
      }
      if(sum_of_fact == temp){
         System.out.println("special number");
      }
      else{
         System.out.println("Not a special number");

      }
   }
}
