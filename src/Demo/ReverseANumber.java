package Demo;

import java.util.Scanner;

public class ReverseANumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no=sc.nextInt();
                int rem,rev=0;
        while(no!=0){
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;

            System.out.println(rev);

            
        }
    }
}


