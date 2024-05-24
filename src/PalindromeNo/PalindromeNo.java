package PalindromeNo;

public class PalindromeNo {
    public static boolean isPalindrome(int num) {
         int original = num;
            int reversed = 0;

            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            return original == reversed;
        }

        public static void main(String[] args){
            int number = 12321; // Change this number to test different cases

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
    }


