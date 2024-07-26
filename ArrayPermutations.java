import java.util.Arrays;

public class ArrayPermutations {
    public static boolean isPossible(int[] a, int[] b, int k) {
        Arrays.sort(a);
        
        Arrays.sort(b);
        for (int i = 0; i < b.length / 2; i++) {
            int temp = b[i];
            b[i] = b[b.length - i - 1];
            b[b.length - i - 1] = temp;
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int[] b = {7, 8, 9};
        int k = 10;
        
        boolean result = isPossible(a, b, k);
        System.out.println(result);
    }
}

// time complexity - O (n)
// space complexity - O (n) for sorting
