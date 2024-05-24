package basic;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        System.out.println("Enter any number:- ");
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 1; i <= times; i++) {
            System.out.println("welcome to java world");
        }
    }
}