import java.util.Scanner;

public class i_dont_know {
    static boolean isPrime(int num){
        boolean flag = true ;
        
        if(num < 2){
            return false ;
        }
        for(int i = 2 ; i < num ; i++){
            if(num%i == 0){
                return false ;
            }
        }
        return flag ;
    }

    static boolean isArmstrong(int num){
        boolean flag = false ;

        int digit = 0 ;
        int result = 0;

        int temp = num ;
        while (temp != 0){
            temp = temp / 10 ;
            digit += 1 ;
        }

        if(digit > 1){
            int temp2 = num ;
            while (temp2 != 0){
            int med = temp2 % 10 ;
            result += Math.pow(med, digit);
            temp2 = temp2/10 ;
        }

            if(result == num){
                return true ;
            }
        }
        return flag ;
    }

    static boolean isPelindrome(int num){
        boolean flag = false ;

        int result = 0 ;

        if (num > 9){
            int temp = num ;
            while (temp != 0) {
                int med = temp%10 ;
                result = (result*10) + med ;
                temp = temp/10 ;
            }
    
            if(result == num){
                return true ;
            }
        }

        return flag ;
    }

    public static void main(String ar[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any positive number : ");
        int userInput = input.nextInt();
        input.close();

        System.out.println("Prime : ");
        for(int i = 0 ; i <= userInput ; i++){
            if(isPrime(i) == true){
                System.out.print(" | " + i);
            }
        }
        System.out.println(" ");

        System.out.println("Pelindrome : ");
        for(int i = 0 ; i <= userInput ; i++){
            if(isPelindrome(i) == true){
                System.out.print(" | " + i);
            }
        }
        System.out.println(" ");

        System.out.println("Armstrong : ");
        for(int i = 0 ; i <= userInput ; i++){
            if(isArmstrong(i) == true){
                System.out.print(" | " + i);
            }
        }

    }
}
