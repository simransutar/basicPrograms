package Demo;
import java.util.Scanner;
public class Fibon {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of terms in the fibonacci series: ");
        int num = obj.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer: ");
        } else {
            generateFibonacciSeries(num);
        }
        obj.close();
    }
    public static void generateFibonacciSeries(int num) {
        int[] fibo = new int[num];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < num; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println("Fibonacci series up to " + num + " terms");
        for (int i = 0; i < num; i++) {
            System.out.println(fibo[i] + "");
        }
    }
}

