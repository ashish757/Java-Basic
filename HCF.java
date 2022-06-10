public class HCF {

    public static int GCD(int n, int n2) {
        int rv = 1;
        if (n >n2) {
            while(true) {
                if (n%n2 == 0) {
                    rv = n2;
                    break;
                } else {
                    int tempn2 = n2;
                    n2 = n%n2;
                    n = tempn2;

                }
            }
        } else {
            while(true) {
                if (n2%n == 0) {
                    rv = n;
                    break;
                } else {
                    int tempn = n;
                    n = n2%n;
                    n2 = tempn;
                }
            }
        }

        return rv;
    }
    public static void main(String[] args) {
        System.out.println(GCD(80, 12));

    //    Scanner sc = new Scanner(System.in);
    //    int n1 = sc.nextInt();
    //    int n2 = sc.nextInt();
 
    //    while(n1 != n2) { 
    //        if(n1>n2) {
    //            n1 = n1 - n2;
    //        } else {
    //            n2 = n2 - n1;
    //        }
    //    }
    //    System.out.println("GCD is : "+ n2);

    }
}
