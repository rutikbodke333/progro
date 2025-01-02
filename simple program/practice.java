import java.util.Scanner;

/**
 * practice
 */
public class practice {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String hexa = "";

    while (n != 0) {
      int d = n % 16;
      if(d < 10){
        hexa  = d + hexa;
      }
      else{
        hexa = d + hexa;
      }

      n = n / 16;
    }

    System.out.println(hexa);
  }
}