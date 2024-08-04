package Array;

import java.util.HashMap;
import java.util.Map;

public class Unique_no {

    static int unique_Num(int[] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], (map.get(arr[i])+1));
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entrySet : map.entrySet()){
            if(entrySet.getValue() == 1){
                return entrySet.getKey() ;
            }
        }
        return -1 ;
    }

    public static void main(String ar[]){
        int [] arr = {1,2,3,4,3,1,2,3,4,5};

        System.out.println("Unique value : " + unique_Num(arr));
    }
}
