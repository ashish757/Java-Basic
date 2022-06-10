public class fibonacchi {
    public static int fibonacchiSeq(int n) {
        int last = 1, secondLast = 0;
        for (int i = 1; i <= n; i++) {

            System.out.print(secondLast + "  ");

            int tempLast = last;

            last = last + secondLast; 
            secondLast = tempLast;
        }
        return secondLast;
    }
    public static void main(String[] args) {
        fibonacchiSeq(4);
    }
}
