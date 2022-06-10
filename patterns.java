class Patterns {
    public static void main(String[] args) {

        int num = 5;

        System.out.println("\npattern 1");
        /*
            * 
            * *
            * * *
            * * * *
            * * * * *
        */
      
        for(int i = 1; i<=num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\npattern 2");
        /*
            * * * * *
            * * * *
            * * *
            * *
            *
        */
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\npattern 3");
        /* 
               *
              * *
             * * *
            * * * *
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                System.out.print("* ");
            }
            for (int m = 1; m <= num-i; m++) {
                System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("\npattern 4");
        /* 
            * * * * *
             * * * *
              * * *
               * *
                *
         */

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                System.out.print("* ");
            }
            for (int m = 1; m <= num-i; m++) {
                System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("\npattern 5");
        /* 
                *
               * *
              * * *
             * * * *
            * * * * *
             * * * *
              * * *
               * *
                *
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        
        System.out.println("\npattern 6");
        /* 
            1
            1 2
            1 2 3 
            1 2 3 4
            1 2 3 4 5
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }

        System.out.println("\npattern 7");
        /* 
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
         */

        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();

        }
        System.out.println("\npattern 8");
        /* 
           1 2 3 4 5
            2 3 4 5
             3 4 5
              4 5
               5
         */

        for (int i = 1; i <= num; i++) {
            for (int n = 1; n < i; n++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j + i - 1 + " ");
            }
            System.out.println();

        }


        System.out.println("\npattern 9");
        /* 
                * * *
               * * *
              * * *
             * * *
            * * *
         */

        for (int i = 1; i <= num; i++) {
            for (int n = 1; n <= num - i; n++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        
        System.out.println("\npattern 10");
        /* 
                *
               * *
              *   *
             *     *
            *       *
            *       *
             *     *
              *   *
               * *
                *
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                if (n == 1) {
                    System.out.print("* ");
                }
                else if (n == i) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

        for (int i = num; i >= 0; i--) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                if (n == 1) {
                    System.out.print("* ");
                }
                else if (n == i) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        

        System.out.println("\npattern 11");
        /* 
                *
               * *
              *   *
             *     *
            * * * * *
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                if (i == num ){
                    System.out.print("* ");
                }
                else if (n == 1) {
                    System.out.print("* ");
                }
                else if (n == i) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }      

            System.out.println();

        }


        
        System.out.println("\npattern 12");
        /* 
            *                 *
            * *             * *
            * * *         * * *
            * * * *     * * * *
            * * * * * * * * * *
            * * * * * * * * * *
            * * * *     * * * *
            * * *         * * *
            * *             * *
            *                 *
         */
        int itr;
        for (int i = 1; i <= 10; i++) {
            if (i >= 6) {
                itr = 10-i + 1;
            } else {
                itr = i;
            }
            for (int j = 1; j <= itr; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 10 - itr * 2; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= itr; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\npattern 13");
        /* 
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5
            
         */
        for (int i = 1; i <= num; i++) {
         
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
            }

            System.out.println();
        }

        System.out.println("\npattern 14");
        /* 
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5
            
         */
        for (int i = 1; i <= num; i++) {
         
            for (int j = 1; j <= num-i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j+ " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+ " ");
            }

            System.out.println();
        }

        


    }
    
}
