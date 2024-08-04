package String;

import java.util.*;

public class LongestSubSequence {

    public static String longestSubSequence(String in){
        String out = "" ;

        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] arr = in.toCharArray();

        for(int i = 0 ; i < arr.length ; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }else{
                i--;
                map.clear();
            }
        }

        out = map.keySet().toString();
        return out ;
    }
    public static void main(String[] args) {
        String in = "abbac" ;

        in = longestSubSequence(in);

        System.out.println(in);
    }
}