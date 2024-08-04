package String;

public class ReverseWordsOfString {

    public static String reverseWord(String input){
        String med = "" ;

        for(int i = input.length()-1 ; i>=0 ; i--){
            med += input.charAt(i);
        }
        return med ;
    }

    public static String reverseWordOfString(String in){
        String reverse = "";

        String [] arr = in.trim().split(" ");

        for(int i = 0 ; i<arr.length; i++){
            reverse += reverseWord(arr[i]) + " ";
        }
        return reverse ;
    }

    public static void main(String[] args) {
        String in = "Hello i am Harsh";

        System.out.println(in);

        in = reverseWordOfString(in);

        System.out.println(in);
    }
}
