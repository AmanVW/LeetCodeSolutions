public class LC_09_Solution {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int oldNumber = x;
        if (x < 0) return false;
        else {
            int newNumber = 0;
            while (x > 0) {
                newNumber = (newNumber * 10) + (x % 10);
                x /= 10;
            }

            return oldNumber == newNumber;
        }
    }
}
