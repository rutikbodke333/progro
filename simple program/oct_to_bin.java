public class oct_to_bin {
    public static void main(String[] args) {

        
        int binary_no = dec(1101, 0, 0);
       
        
    }
    public static int dec(int n , int sum, int power) {
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit * pow(2, power);
            power++;
            n = n /10;
            
        }
        return sum;
    }
    public static int pow(int n, int p){
        int prod = 1;
        for(int i = 1;i <= p;i ++){
            prod = prod * n;
        }
        return prod;

    }
}
