class BubbleSort {
    public static void printInOneLine(int[] rv) {
        for (int i = 0; i < rv.length; i++) {
            System.out.print(rv[i]+ " | ");
        }
        System.out.println();
    }

    public static int[] Sort(int[] nums) {
        boolean swap;
        printInOneLine(nums);
        System.out.println();


        for (int i = 0; i < nums.length - 1; i++) {
            swap = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                printInOneLine(nums);
            }
            System.out.println();
            if (!swap)
                break;
            // if (i == nums.length - 1) break;

            // int first = nums[i];
            // int second = nums[i + 1];

        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 5,4,3,2,1 };
        // 355 90

        int[] sortedNums = Sort(nums);

        for (int i = 0; i < sortedNums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}