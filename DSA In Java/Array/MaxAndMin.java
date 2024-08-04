package Array;

public class MaxAndMin {
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max ;
    }

    static int min(int[] arr){
        int min = Integer.MAX_VALUE ;

        for(int i  = 0 ; i<arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min ;
    }

    static void minANDmax(int[] arr){
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max - " + max + " | " + "Min - " + min);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,2,7,6,7};

        System.out.println("Max : " + max(arr));
        System.out.println("Min : " + min(arr));
        minANDmax(arr);
    }
}
