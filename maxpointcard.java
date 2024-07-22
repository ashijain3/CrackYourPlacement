public class maxpointcard {

    public static int maxScore(int[] cardPoints, int k) {

        int leftSum=0, rightSum=0;int n=cardPoints.length-1,maxSum=0;

        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
        }
        maxSum= Math.max(leftSum,maxSum);
        for(int i=k-1;i>=0;i--){

            leftSum-=cardPoints[i];
            rightSum+=cardPoints[n];
            n--;
            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
        
    }

    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
        }
    
}

// time complexity -O(N)
// space complexity -O(1)
