package Array;

public class FirstEx {
    public static void main(String[]args){

       int[]num=new int[5];

       num[0]=10;
       num[1]=20;
       num[2]=30;
       num[3]=40;
       num[4]=50;

        System.out.println("Element at index 0: "+num[0]);
        System.out.println("Element at index 1: "+num[1]);
        System.out.println("Element at index 2: "+num[2]);
        System.out.println("Element at index 3: "+num[3]);
        System.out.println("Element at index 4: "+num[4]);

        int sum=0;
        for (int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println("sum of all elemnts: "+sum);
    }
}
