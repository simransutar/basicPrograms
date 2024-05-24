package EvenOdd;
public class SumOfEvenNo{
    public static void main(String[] args) {
        int sum = 0;
       //int MinEven=Integer.MAX_VALUE;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;

            }
        }
        System.out.println("sum of even numbers from 1 to 100 :- " + sum);
    }
}
