import java.util.*;
public class PrimeNoRange {
  // add some comment
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your input: ");
        int n = sc.nextInt();
        int PrimeCount = 0;
        for(int i = 2; i <=n; i++){
          int factorCount = 0;

          for(int j = 1; j <=i; j++){
            if(i%j == 0){
               factorCount = factorCount + 1;
            }
          }
          if(factorCount == 2){
            PrimeCount = PrimeCount + 1;
         }
        }
        
        System.out.println(PrimeCount);
    }
}
