import java.util.ArrayList;
import java.util.Collections;

public class choclatedistri {

    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long res = Long.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int minelement = a.get(i);
            int maxelement = a.get(i+m-1);
            res = Math.min(res,maxelement-minelement);
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(7);
        a.add(4);
        a.add(5);
        a.add(56);
        a.add(9);
        System.out.println( findMinDiff(a, 7, 5));
        
    }
    
}

// time complexity -O(n)
// space complexity -O(1)