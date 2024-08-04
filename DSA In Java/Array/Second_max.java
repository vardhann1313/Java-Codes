package Array;
public class Second_max {
    
    static int second_max_value(int[] arr){
        int sec_max = Integer.MIN_VALUE ;
        int max = Integer.MIN_VALUE ;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                sec_max = max ;
                max = arr[i] ;
            }else if(arr[i] == max){
                continue ;
            }else if(arr[i] > sec_max){
                sec_max = arr[i] ;
            }
        }
        return sec_max ;
    }

    public static void main (String ar[]){

        int [] arr = {1,2,5,2,8,40,-9,40};
        int ans = second_max_value(arr);

        System.out.println("Second max value : " + ans);
    }
}
