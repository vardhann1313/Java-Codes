package String;

import java.util.*;

public class StringOperations {
//---------------------------------------------------------------------------------------------------------------- //
    public static String removeSpace(String in){ // 1
        return in.replaceAll("\\s", ""); // \\s => whitespace character .
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static String removeSpecialCharacter(String in){ // 2
        return in.replaceAll("[^\\w]", ""); // \\w => "[a-zA-Z0-9]" || ^\\w => "[^a-zA-Z0-9]"
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static String removeDuplicate(String in){ // 3
        String out = "" ;

        for(int i = 0 ; i<in.length() ; i++){
            char ch = in.charAt(i);
            int idx = in.indexOf(ch, (i+1));
            if(idx == -1){
                out += ch ;
            }
        }
        return out ;
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static String removeDuplicateBySet(String in){ // 3
        String out = "";

        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i<in.length() ; i++){
            if(set.add(in.charAt(i))){
                out += in.charAt(i);
            }
        }
        return out ;
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static String sortString(String in){ // 4

        char temp;
        char[] char_in = in.toCharArray();

        for(int i = 0 ; i < char_in.length ; i++){
            for(int j = i+1 ; j<char_in.length ; j++){
                if(char_in[i]>char_in[j]){
                    temp = char_in[i];
                    char_in[i] = char_in[j];
                    char_in[j] = temp;
                }
            }
        }
        return (new String(char_in));
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static String replaceWithOccurence(String in, char c){ // 5

        if(in.indexOf(c) == -1){
            return "Character not found in string !";
        }

        int val = 1 ;
        for(int i = 0 ; i<in.length() ; i++){
            if(in.charAt(i) == c){
                in = in.replaceFirst(String.valueOf(c),String.valueOf(val));
                val++;
            }
        }
        return in ;
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static String firstNonRepeatedChar(String in){ // 6
        String f = "No character !" ;

        for(int i = 0 ; i<in.length() ; i++){
            boolean unique = true ;

            for(int j = 0 ; j<in.length() ; j++){

                if(i!=j && in.charAt(i) == in.charAt(j)){
                    unique = false ;
                    break ;
                }
            }
            if(unique  == true){
                return String.valueOf(in.charAt(i));
            }
        }
        return f ;
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static String firstNonRepeatedCharByMap(String in){ // 6
        String f = "No character !" ;

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0 ; i<in.length() ; i++){
            char ch = in.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, (map.get(ch)+1));
            }else{
                map.put(ch, 1);
            }
        }

        for( Map.Entry<Character, Integer> entrySet : map.entrySet()){
            if(entrySet.getValue()==1){
                return String.valueOf(entrySet.getKey());
            }
        }
        System.out.println(map);
        return f ;
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static Map<Character, Integer> occurenceOfChars(String in){
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i<in.length() ; i++){
            char ch = in.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, (map.get(ch)+1));
            }else{
                map.put(ch, 1);
            }
        }
        return map ;
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static void main(String[] args) {
        String in = "haarshh";

        System.out.println(in);

        // in = removeSpace(in);
        // in = removeSpecialCharacter(in);
        // in = removeDuplicate(in);
        // in = removeDuplicateBySet(in);
        // in = sortString(in);
        // in = replaceWithOccurence(in, 'f');
        // in = firstNonRepeatedCharByMap(in);

        System.out.println(in);

        // Map<Character, Integer> map = occurenceOfChars(in);
        // for(Map.Entry<Character, Integer> entrySet : map.entrySet()){
        //     System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        // }
    }
}