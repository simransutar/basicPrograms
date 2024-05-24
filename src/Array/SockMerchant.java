package Array;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    static int sockMerchant(int n,int[]ar){
        Map<Integer,Integer> socksCount=new HashMap<>();
        int pairs=0;

        for(int color:ar) {
            socksCount.put(color, socksCount.getOrDefault(color, 0) + 1);
        }
        for (int count:socksCount.values()){
            pairs+=count/2;
        }
        return pairs;
        }
        public static void main(String[]args){
        int n=9;
        int[]ar={10,20,20,10,10,30,50,10,20};
        int pairs=sockMerchant(n,ar);
            System.out.println("number of paris: "+pairs);

        }
    }

