package EvenOdd;

import java.util.Scanner;

public class UsingTCEvenOdd {
    public static void main(String[]args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int num=sc.nextInt();
            if(num%2==0){
                System.out.println(num+"is an even number");
            }
            else{
                System.out.println(num+"is an odd number");
            }}
            catch(Exception e){
                e.printStackTrace();
        }
        }}




