package Array;
import java.util.Arrays;

public class Rotate_Array {
    // Using extra space -------
    static int [] rotate_array(int [] arr, int k){

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
    static void rotate_original_array(int [] arr, int k){

        int n = arr.length ;
        k = k%n ;

        reverse_given_array(arr, 0, k-1);
        reverse_given_array(arr, k, n-1);
        reverse_given_array(arr, 0, n-1);

    }

    public static void main(String ar[]){
        int [] arr = {1,2,3,4,5,6};

        //System.out.println("Original : " + Arrays.toString(arr));
        //int [] ans = rotate_array(arr, 8);
        //System.out.println("Reverse : " + Arrays.toString(ans));

        System.out.println("Original : " + Arrays.toString(arr));
        rotate_original_array(arr, 9);
        System.out.println("Reverse : " + Arrays.toString(arr));
    }
}
