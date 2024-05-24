package PalindromeNo;
import java.util.Scanner;
public class PalindromeUsingScan {
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=obj.nextInt();
        if(isPalindrome(num)){
            System.out.println(num+"is a palindrome number");
        }
        else{
            System.out.println(num+"is not a palindrome number");
        }
    }}
        

