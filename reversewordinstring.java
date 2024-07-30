public class reversewordinstring {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            ans.append(words[i]);
            if(i != 0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World!")); 
        
    }
    
}

// time complexity - O(n)
// space complexity - O(n)
