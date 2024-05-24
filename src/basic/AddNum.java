package basic;

import java.util.Scanner;

public class AddNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=x+y;
        System.out.println(sum);
    sc.close();
}}

