package Factorial;

import java.util.Scanner;

public class FactorialUsingScan {
    public static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int num = obj.nextInt();
        int factorial = calculateFactorial(num);

        System.out.println("Factorial of " + num + " is: " + factorial);
        obj.close();
    }
}





