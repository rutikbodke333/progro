public class AmstrongNo {
    public static void main(String[] args) {
        int n = 371;
        int temp = n;
        int sum = 0;
        int countOfDigit = countDigit(n);
        while (n != 0) {
            int digit = n % 10;
            sum = sum + pow(digit, countOfDigit);
            n = n / 10;

        }
        System.out.println(sum);
        if (sum == temp) {
            System.out.println("Amstrong Number");

        } else {
            System.out.println("Not a Amstrong Number");
        }
    }

    public static int pow(int n, int p) {
        int prod = 1;
        for (int i = 1; i <= p; i++) {
            prod = prod * n;

        }
        return prod;

    }

    public static int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;

        }
        return count;
    }
}
