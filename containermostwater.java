public class containermostwater {
    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int res = 0;
        
        while (left < right) {
            int containerLength = right - left;
            int area = containerLength * Math.min(heights[left], heights[right]);
            res = Math.max(res, area);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
    
}

//time complexity -O(n)
//space complexity -O(1)
