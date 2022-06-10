import java.util.Scanner;

public class factorial {

    public static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        int rv = number * getFactorial(number - 1);
        // if (number == 0) {
        //     return rv;
        // }


        // for (int i = number; i > 1; i-- ){
        //     rv *= i;
        // }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFactorial(n));
        sc.close();
    }
}
