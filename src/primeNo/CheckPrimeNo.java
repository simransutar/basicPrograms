package primeNo;


import java.util.Scanner;

public class CheckPrimeNo {
    public static void main(String[]args){
        System.out.println("Enter a number:- ");
        Scanner r=new Scanner(System.in);
        int n,count=0;
        n=r.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
            if(count==2){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not prime number");

        }
    }
}
