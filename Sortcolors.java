public class Sortcolors {

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n - 1;

        while (j <= k) { 
            if (nums[j] == 1) {
                j++;
            } else if (nums[j] == 2) {
                swap(nums, j, k);
                k--;
            } else {
                swap(nums, j, i);
                i++;
                j++;
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {

        int nums[] ={2,0,2,1,1,0};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            }
    } 
}

// time complexity - O(n)
// space complexity - O(1)
