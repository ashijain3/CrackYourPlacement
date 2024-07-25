import java.util.Arrays;

public class minmovetoequalarray {
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int mid = nums[nums.length / 2];
        int count = 0;

        for (int num : nums)
            count += Math.abs(mid - num);

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves2(nums));
    }
    
}
// time complexity -O(n)
// space complexity -O(1)
