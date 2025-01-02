public class any_num_to_decimal {
    public static void main(String[] args) {
        int n = 1101;
        int sum = 0;
        int power = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit * pow(2, power);
            power++;
            n = n /10;
            
        }
        System.out.println(sum);
    }

    public static int pow(int n, int p){
        int prod = 1;
        for(int i = 1;i <= p;i ++){
            prod = prod * n;
        }
        return prod;

    }
}
