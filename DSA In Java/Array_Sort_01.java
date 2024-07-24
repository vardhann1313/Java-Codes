import java.util.Arrays;

public class Array_Sort_01 {

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void sortArray(int[] arr){
        int i = 0;
        int j = (arr.length - 1) ;

        while (j>i) {
            if(arr[i] == 0){
                i++;
                continue;
            } else {
                if(arr[j] == 1){
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
        int[] arr = {1,0,1,0,1,0,};

        System.out.println(Arrays.toString(arr));
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
