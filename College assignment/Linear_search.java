public class Linear_search {
    static int linear_search(int [] arr, int value){
        int ans = -1 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == value){
                return i ;
            }
        }

        return ans ;
    }

    public static void main(String ar[]){
        int [] arr = {1,2,3,6,4,8,9};
        int value = 6 ;
        int ans = linear_search(arr, value);

        System.out.println(value + " is at the index " + ans);
    }
}
