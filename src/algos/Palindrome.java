package algos;

public class Palindrome {

    public static boolean isPalindrome(String line) {
        if (line.isEmpty()) {
            return false;
        }
        boolean result = true;
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                result = false;
            }
        }
        return result;
    }

    public static boolean isPalindrome2(String line) {
        if (line.isEmpty()) {
            return false;
        }
        return line.equals(new StringBuilder(line).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("3333333333")); // true
        System.out.println(isPalindrome("potop")); // true
        System.out.println(isPalindrome2("potop")); // true
        System.out.println(isPalindrome2("заказ")); // true
        System.out.println(isPalindrome("333233333")); // false
        System.out.println(isPalindrome2("333233333")); // false
        System.out.println(isPalindrome("")); // false
        System.out.println(isPalindrome2("")); // false
    }
}
