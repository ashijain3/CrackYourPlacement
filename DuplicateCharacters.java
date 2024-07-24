import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void printDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "programming";
        printDuplicateCharacters(str);
    }
}
// time complexity -O(n)
// space complexity -O(n)