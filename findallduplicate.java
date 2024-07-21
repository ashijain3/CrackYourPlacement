import java.util.*;

public class findallduplicate {
    public static  List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if (x - 1 < n && nums[x - 1] < 0) {
                ans.add(x);
            }
            if (x - 1 < n) {
                nums[x - 1] *= -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3};
        System.out.println(findDuplicates(nums));
    }
}
    

