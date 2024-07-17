public class Frequency_array {
    static int [] create_freq_array(int[] arr, int size){
        int [] f_arr = new int[size+1]; 
        // size of frequency array is the max value given array can have. [size + 1] because indexing starts from 0

        for(int i = 0 ; i < arr.length ; i++){
            f_arr[arr[i]] += 1;
        }

        return f_arr;
    }

    static boolean isPresent(int [] arr, int value, int [] f_arr){
        boolean flag = false ;

        if(f_arr.length < value){
            return flag ;
        }
        if(f_arr[value] > 0){
            flag = true ;
        }

        return flag ;
    }

    public static void main(String ar[]){
        int [] arr = {1,2,3,4,78,90,35,20,12,56,78,99,100};
        int [] f_arr = create_freq_array(arr, 100);

        boolean ans = isPresent(arr, 20, f_arr);
        System.out.println(" 20 is Present : " + ans);

        boolean ans2 = isPresent(arr, 100, f_arr);
        System.out.println(" 100 is Present : " + ans2);


    }
}
