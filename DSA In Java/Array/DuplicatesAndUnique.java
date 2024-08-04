package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesAndUnique {

    static void duplicate(int[] arr){
        Set<Integer> dup = new HashSet<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(!dup.add(arr[i])){
                System.out.println("Duplicate : " + arr[i]);
            }
        }
    }

    static void unique(int [] arr){
        int unique  = -1 ;
        for(int i = 0 ; i<arr.length ; i++){
            unique = arr[i];
            for(int j = 0 ; j<arr.length ; j++){
                if(i == j){
                    continue;
                }else if(arr[i] == arr[j]){
                    unique = -1 ;
                }
            }
            if(unique > 0){
                System.out.println("Unique : " + unique);
                return ;
            }
        }
        System.out.println("Unique : " + unique);
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,4,3};
        duplicate(arr);
        unique(arr);
    }
}
