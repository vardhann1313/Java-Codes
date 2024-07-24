package Array;
import java.util.Arrays;

public class Array_Sort_Even_Odd {

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void sortArrayEvenOdd(int[] arr){
        int i = 0;
        int j = (arr.length - 1) ;

        while (j>i) {
            if(arr[i]%2 == 0){
                i++;
                continue;
            } else {
                if(arr[j]%2 != 0){
                    j--;
                    continue;
                } else {
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,9,4,5,7,6,10};

        System.out.println(Arrays.toString(arr));
        sortArrayEvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
