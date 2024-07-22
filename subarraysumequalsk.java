import java.util.HashMap;

public class subarraysumequalsk {

    public static int subarraysum( int nums[] , int k){

        int sum =0 ,result =0;
        HashMap<Integer,Integer> presum = new HashMap<>();

        presum.put(0,1);
        for( int i =0 ; i<nums.length ; i++){
            sum += nums[i];
            if( presum.containsKey(sum-k)){
                result += presum.get(sum-k);
            }
            presum.put(sum,presum.getOrDefault(sum,0)+1);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(subarraysum(nums,3));
    }
    
}

// time complexity - 0(n)
// space complexity - 0(n)
