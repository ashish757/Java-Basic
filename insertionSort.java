class InsertionSort {
    public static int[] Sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = i;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[current] < nums[j]) {
                    int tempJ = nums[j];
                    nums[j] = nums[current];

                    nums[current] = tempJ;
                    current--;
                } else {
                    break;
                }
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {5,4,67,3,2,1};

        int[] sortedNums = Sort(nums);
        
        for (int i = 0; i<sortedNums.length;i++){
            System.out.println(sortedNums[i]);
        }
    }
}
