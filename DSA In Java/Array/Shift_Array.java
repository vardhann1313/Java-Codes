package Array;
import java.util.Arrays;

public class Shift_Array {
    // Using extra space -------
    static int [] shift_array(int [] arr, int k){

        int n = arr.length ;
        int [] ans = new int[n];

        k = k%n ;
        int j = 0 ;

        for(int i = (n-k) ; i < n ; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0 ; i < (n-k) ; i++){
            ans[j++] = arr[i];
        }
        
        return ans ;
    }

    // Reverse and modify given array -- in-place ---
    static void reverse_given_array(int [] arr, int from, int to){
        int i = to ;
        int j = from ;
        System.out.println("From : j = " + j + " To : " + i);

        while (j < i) {
            arr[j] = arr[j] + arr[i];
            arr[i] = arr[j] - arr[i];
            arr[j] = arr[j] - arr[i];
            i--;j++ ;
        }
    }
    // Without using extra space --------
    static void left_shift_original_array(int [] arr, int k){

        int n = arr.length ;
        k = k%n ;

        reverse_given_array(arr, 0, k-1);
        reverse_given_array(arr, k, n-1);
        reverse_given_array(arr, 0, n-1);
    }

    // Without using extra space --------
    static void right_shift_original_array(int [] arr, int k){

        int n = arr.length ;
        k = k%n ;

        reverse_given_array(arr, 0, (n-k-1));
        reverse_given_array(arr, (n - k), (n-1));
        reverse_given_array(arr, 0, (n-1));
    }

    public static void main(String ar[]){
        int [] arr = {1,2,3,4,5,6};

        //System.out.println("Original : " + Arrays.toString(arr));
        //int [] ans = shift_array(arr, 8);
        //System.out.println("Reverse : " + Arrays.toString(ans));

        // System.out.println("Original : " + Arrays.toString(arr));
        // left_shift_original_array(arr, 9);
        // System.out.println("Reverse : " + Arrays.toString(arr));

        System.out.println("Original : " + Arrays.toString(arr));
        right_shift_original_array(arr, 2);
        System.out.println("Reverse : " + Arrays.toString(arr));
    }
}
