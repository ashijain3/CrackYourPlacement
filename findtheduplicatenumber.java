class findtheduplicatenumber {
    public static int findDuplicate(int[] nums) {
        int i = nums[0];
        int j = nums[0];
        do { 
            i = nums[i];
            j = nums[nums[j]];
        } while(i != j);
        j = nums[0];
        while(i != j) {
            i = nums[i];
            j = nums[j];
        }
        return j;
    }
    public static void main(String[] args) {
        int nums[]= new int[]{1,3,4,2,2};
        int r = findDuplicate(nums);
        System.out.println(r);
    }
}

// time complexity - O(n)
// space complexity - O(1)