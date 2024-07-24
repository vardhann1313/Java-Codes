package Array;
import java.util.Arrays;

public class Reversing_array {

    // Reverse and return new array --
    static int[] reverse_return_new_array(int[] arr){
        int [] ans =  new int[arr.length] ;
        int j = 0 ;

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            ans[j++] = arr[i];
        }
        
        return ans ;
    }

    // Reverse and modify given array -- in-place ---
    static void reverse_given_array(int [] arr){
        int i = arr.length - 1 ;
        int j = 0 ;

        while (j < i) {
            arr[j] = arr[j] + arr[i];
            arr[i] = arr[j] - arr[i];
            arr[j] = arr[j] - arr[i];
            i--;j++ ;
        }
    }
    public static void main (String ar[]){

        int [] arr = {1,2,3,4,5};
        int [] ans = reverse_return_new_array(arr);

        System.out.println("Original : " + Arrays.toString(arr));
        System.out.println("Reverse : "  + Arrays.toString(ans));

        System.out.println("Original : " + Arrays.toString(arr));
        reverse_given_array(arr);
        System.out.println("Reverse : " + Arrays.toString(arr));
    }
}