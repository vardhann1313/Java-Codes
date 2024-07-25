package Array;

public class SubArray_Eq_Sum {
    
    public static void prefix_sum(int [] arr){
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }

    public static void subArraySum(int[] arr){
        prefix_sum(arr);

        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i] == arr[arr.length-1] - arr[i]){
                System.out.println("Index : 0 To " + i +   " And : " + (i+1) + " To " + (arr.length-1));
            }
        }
    }               

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,4,5,6,7,2,7,6,3,4,6};
        subArraySum(arr);
    }
}
