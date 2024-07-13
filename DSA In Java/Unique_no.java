public class Unique_no {
    static int unique_Num(int[] arr){
        int num = -1 ;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if (arr[i] == arr[j]){
                    arr[i] = -1 ;
                    arr[j] = -1 ;
                }
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                return arr[i];
            }
        }
        return num ;
    }

    public static void main(String ar[]){
        int [] arr = {1,2,3,4,1,2,3,4,5};

        System.out.println("Unique value : " + unique_Num(arr));
    }

}
