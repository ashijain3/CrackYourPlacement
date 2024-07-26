import java.util.HashSet;
import java.util.Set;

public class PairWithGivenDifference {
    public static int findPairWithGivenDifference(int[] arr, int x) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (set.contains(num + x) || set.contains(num - x)) {
                return 1;
            }
            set.add(num);
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 2, 50, 80};
        int x = 78;
        
        int result = findPairWithGivenDifference(arr, x);
        System.out.println(result); 
    }
}
// time complexity - O(n)
// space complexity - O(n)