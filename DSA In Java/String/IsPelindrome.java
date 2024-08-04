package String;

import java.util.Scanner;

public class IsPelindrome {

//---------------------------------------------------------------------------------------------------------------- //
    public static boolean isPelindrome(String in){
        String med = "" ;
        boolean flag = false ;

        for(int i = (in.length()-1) ; i>=0 ; i--){
            med += in.charAt(i);
        }

        if(med.equals(in)){
            flag = true ;
        }

        return flag ;
    }

//---------------------------------------------------------------------------------------------------------------- //
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String in = input.next();
        input.close();
    
        boolean ans = isPelindrome(in.toLowerCase());
        System.out.println("Ispelindrome : " + ans);
    }
}
