package Array;
public class Two_Pair_Sum {

    static int count_pair(int[] arr, int value){
        int count = 0;

        for (int i = 0 ; i<arr.length ; i++){
            for (int j = i+1 ; j<arr.length ; j++){
                if (arr[i] + arr[j] == value){
                    System.out.println("| val 1 - " + arr[i] + "| val 2 - " + arr[j]);
                    count ++ ;
                }
            }
        }

        return count;
    }
    public static void main(String ar[]){

        int [] arr = {2,3,4,6,8,0,-2};
        System.out.println("No. of pair : " + count_pair(arr, 4));

    }
}
