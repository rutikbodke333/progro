public class find_first_last_digit {
    public static void main(String[] args) {
        int n = 989841;
        int totaldigit = (int) Math.log10(n);
        int firstdigit = (int) (n / Math.pow(totaldigit, totaldigit))
    }
}
