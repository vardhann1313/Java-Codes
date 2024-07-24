package Array;

import java.util.Arrays;

public class Prefix_Sum {

    public static void prefix_sum(int [] arr){
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }

    public static int[] prefix_sum(int [] arr, int from, int to){
        int [] res = new int[to - from + 1];
        int k = 0 ;

        for(int i = from ; i <= to ; i++){
            res[k++] = arr[i] ;
        }

        prefix_sum(res);

        return res ;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};

        // prefix_sum(arr);
        // System.out.println(Arrays.toString(arr));

        int [] res = prefix_sum(arr, 2, 4);
        System.out.println(Arrays.toString(res));
    }
}
