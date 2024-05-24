package fibonacci;

import java.util.Scanner;

public class Fibon{
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of terms in the fibonacci series: ");
        int numTerms=obj.nextInt();
        obj.close();
        System.out.print("Fibonacci Series");
        for(int i=0;i<numTerms;i++){
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
