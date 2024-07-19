public class movezeros {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=j; i<n; i++) {
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }        
    }
    
}
// Time complexity: O(n)
// Space complexity: O(1)
