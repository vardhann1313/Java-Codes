import java.util.Arrays;

public class Array_Square_Sort {

    public static int[] sort_Array_Square(int[] arr){
        int[] res = new int [arr.length];
        int i = 0 ;
        int j = arr.length -1 ;
        int k = res.length -1 ;

        while (j>=i) {

            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                res[k--] = arr[i]*arr[i++];

            } else if (Math.abs(arr[i]) < Math.abs(arr[j])){
                res[k--] = arr[j]*arr[j--];

            } else if (Math.abs(arr[i]) == Math.abs(arr[j])) {
                res[k--] = arr[j]*arr[j--];
                
            } else {
                res[k] = arr[i]*arr[i++];

            }
        }

        return res;
    }
    public static void main(String[] args) {

        int[] arr = {-10, -3, -2, 1, 1, 3, 4, 5, 6};
        int[] res = sort_Array_Square(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
        
    }
}
