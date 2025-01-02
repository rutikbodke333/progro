public class p3 {
    public static void print(int n) {
        // System.out.println("sheela , ak bhar dikha do");
        if(n >= 1){
            System.out.println(n);
            n--;
            print(n);
  
        }

    }

    public static void main(String[] args) {
        // System.out.println("hi, how are you");
        print(5);
    }
}
