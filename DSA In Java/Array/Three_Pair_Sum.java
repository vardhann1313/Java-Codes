package Array;
public class Three_Pair_Sum {

    static int count_pair(int[] arr, int value){
        int count = 0;

        for (int i = 0 ; i<arr.length ; i++){
            for (int j = i+1 ; j<arr.length ; j++){
                for (int k = j+1 ; k<arr.length ; k++){
                    if (arr[i] + arr[j] + arr[k] == value){
                        System.out.println("| val 1 - " + arr[i] + "| val 2 - " + arr[j] + "| val 3 - " + arr[k]);
                        count ++ ;
                    }
                }
            }
        }

        return count;
    }
    public static void main(String ar[]){

        int [] arr = {2,3,4,6,8,0,-2};
        int value = 8 ;
        System.out.println("No. of pair for value " + value + " : " + count_pair(arr, value));

    }
}
