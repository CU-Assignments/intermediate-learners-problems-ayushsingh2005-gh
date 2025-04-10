public class Solutions {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

      
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        int input1 = 121;
        System.out.println("Input: " + input1);
        System.out.println("Output: " + isPalindrome(input1));  // true

        int input2 = -121;
        System.out.println("Input: " + input2);
        System.out.println("Output: " + isPalindrome(input2));  // false
    }
}
