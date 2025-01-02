public class reverse_no {
    public static void print(int n) {

        if (n >= 1) {
            System.out.println(n);
            n--;
            print(n);
        }
    }

    public static void main(String args[]) {
        print(500);
    }
}
