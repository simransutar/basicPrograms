package armstrong;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int number=sc.nextInt();
        sc.close();
        if(isArmstrong(number))
            System.out.println(number+"is an armstrong number.");
        else
            System.out.println(number+"is not an armstrong number.");
    }

   public static boolean isArmstrong(int number){
        int originalNumber,reminder,result=0,n=0;
        originalNumber=number;

        for(;originalNumber!=0;originalNumber/=10,++n);
        originalNumber=number;

        for(;originalNumber!=0;originalNumber/=10){
            int remainder=originalNumber%10;
            result+=Math.pow(remainder,n);
        }
        return result==number;
   }}

