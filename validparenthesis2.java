public class validparenthesis2 {

        public static boolean validPalindrome(String s) {
            int l = 0, r = s.length() - 1;
            while(l < r) {
                char lc = s.charAt(l);
                char rc = s.charAt(r);
                if(lc != rc) return compare(s, l + 1, r) || compare(s, l, r - 1);
                l++;
                r--;
            }
            return true;
        }
    
        public static boolean compare(String s, int l, int r) {
            while(l < r) {
                char lc = s.charAt(l);
                char rc = s.charAt(r);
                if(lc != rc) return false;
                l++;
                r--;
            }
            return true;
        }
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));        
    }  
} 

// time complexity -O(n)
// space complexity - O(1)
    

