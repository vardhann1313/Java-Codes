package Array;
public class Second_max {
    static int max_value(int[] arr){
        int max = Integer.MIN_VALUE ;

        for(int i = 0 ; i<arr.length ; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max ;
    }
    
    static int second_max_value(int[] arr){
        int sec_max = Integer.MIN_VALUE ;
        int max = max_value(arr);

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE ;
            }
        }

        sec_max = max_value(arr);

        return sec_max ;
    }

    public static void main (String ar[]){

        int [] arr = {1,2,5,2,8,40,-9,40};
        int ans = second_max_value(arr);

        System.out.println("Second max value : " + ans);
    }
}
