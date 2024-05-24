package primeNo;

import java.util.Scanner;

public class CheckingPrimeNo {
    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number:-");
    int number=s.nextInt();
    if(isPrime(number)){
        System.out.println("Prime number");
    }else{
        System.out.println("not a prime number");
    }
    s.close();
}
}
