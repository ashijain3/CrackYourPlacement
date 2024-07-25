public class productpuzzlearray {
        public static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int ans[] = new int[n];
            int pro = 1;
            for(int i : nums) {
                pro *= i;
            }
            
            for(int i = 0; i < n; i++) {
                ans[i] = pro / nums[i];
            }
            return ans;
        }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        for(int i : ans) {
            System.out.println(i);
        }
        
    }
    
}

//time complexity -O(n)
//space complexity -O(n)
