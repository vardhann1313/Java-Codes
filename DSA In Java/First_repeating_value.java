public class First_repeating_value {
    static int find_val(int[] arr){
        int val = Integer.MIN_VALUE;

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return val ;
    }

    public static void main(String ar[]){
        int [] arr = {-1,2,-1,4,6,7};
        int ans = find_val(arr);
        System.out.println("First repeating value is : " + ans);
    }
}
