import java.util.HashSet;

public class Solutions {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input1 = "abcabcbb";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + lengthOfLongestSubstring(input1));  // Output: 3

        String input2 = "bbbbb";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + lengthOfLongestSubstring(input2));  // Output: 1
    }
}
