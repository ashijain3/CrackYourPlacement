import java.util.HashMap;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> map = new HashMap<>();
    int n=nums.length;
    for (int i=0;i<n;i++){
        int a = nums[i];
        int moreneed = target-a;
        if (map.containsKey(moreneed)){
            return new int[]{map.get(moreneed), i};
        }
        else {
            map.put(nums[i],i);
        }
    }
    return null;
}
public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;
    int[] result = twoSum(nums,target);
    System.out.println(result[0]+","+result[1]);
    }
    
}
