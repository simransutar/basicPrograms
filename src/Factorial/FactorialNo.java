package Factorial;

import java.util.Scanner;

public class FactorialNo {
    static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
    return result;
}
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:-");
    int n = sc.nextInt();
    System.out.println(fact(n));
    sc.close();
}}