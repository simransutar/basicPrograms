package primeNo;

import java.util.Scanner;

public class PrimeNoCheck {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n<=3){
            return true;
        }
        if(n%2==0||n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        return true;
        }




         public static void main(String[]args){
             System.out.println("Enter a number:-");
             Scanner obj=new Scanner(System.in);
             int number=obj.nextInt();
             if(isPrime(number)){
                 System.out.println(number +  " is a prime number");
             }else{
                 System.out.println(number + " is not a prime number");
             }
             obj.close();
    }}
