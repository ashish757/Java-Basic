class SelectionSort {
    public static void printInOneLine(int[] rv) {
        for (int i = 0; i < rv.length; i++) {
            System.out.print(rv[i]+ " | ");
        }
        System.out.println();
    }

    public static int[] Sort(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {

            int smallest = i;

            for (int j = i+1; j < nums.length; j++ ) {
                if (nums[j] < nums[smallest]){
                    smallest = j;
                }
                
            }
            int currentEle = nums[i];

            nums[i] = nums[smallest];
            nums[smallest] = currentEle;
            System.out.println("OUTER LOOP FINISED");
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {5,3,4,2,1};

        int sortedNums[] = Sort(nums);
        for (int i = 0; i<sortedNums.length;i++){
            System.out.println(sortedNums[i]);
        }
    }
}
