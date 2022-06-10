
class Main {

    static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n-1);

    }
    static int getFibo(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n == 3) return 1;

        return getFibo(n-1) + getFibo(n-2);

        // int Fibonacci  = 0;
        
        // int first = 0;
        // int second = 1;
        // for (int i = 1; i <= n; i++) {
            
        //     System.out.print(first + " ");
        //     Fibonacci = first;
        //     int tempThird  = first + second;
        //     first = second;
        //     second = tempThird;

        // }
        // System.out.println();
        // return Fibonacci;
    }
    public static void main(String[] args) {
        // String str = "Ashish () Raj () Singh";

        // String modifiedString = str.replace("()", "_");

        // System.out.println(modifiedString);


        // int [] matrix1 = {1,2,3,4,5,6,7,8};

        // int startingElements = matrix1.length/2;

        // for (int i = 0; i < matrix1.length; i++) {
        //     if (i == startingElements) {
        //         break;
        //     }
            
        //     int temp = matrix1[i];
        //     matrix1[i] = matrix1[matrix1.length - 1 - i];
        //     matrix1[matrix1.length - 1 - i] = temp;
        // }

        // for (int i : matrix1) {
        //     System.out.print(i + " ");
        // }

        // System.out.println(Math.floorDiv(9, 2));
        // System.out.println(9/2);

        
        System.out.println(getFibo(6));
        
    }
}