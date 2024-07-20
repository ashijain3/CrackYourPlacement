import java.util.HashMap;

public class subarraysumdivbyk {
    public static int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefix_sum=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            prefix_sum+=nums[i];
            int rem=prefix_sum % k;
            if(rem<0){
                rem=(rem+k);
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }else{
                map.put(rem,1);
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={4,5,0,-2,-3,1};
        int k=5;
        System.out.println(subarraysDivByK(nums,k));       
    }
    
}

// time complexity - O(n)
// space complexity - O(n)
