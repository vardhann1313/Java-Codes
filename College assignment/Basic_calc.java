import java.util.Scanner;

public class Basic_calc {
    static float calculate(float n1, float n2, int operation){
        float ans = Integer.MAX_VALUE ;

        if(operation == 1){
            ans = n1 + n2 ;
        } else if (operation == 2){
            ans = n1 - n2 ;
        } else if (operation == 3){
            ans = n1 * n2 ;
        }else if (operation == 4){
            return ans = n1 / n2 ;
        }

        return ans ;
    }

    public static void main(String ar[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value : ");
        float n1 = input.nextFloat(); 

        System.out.print("Enter second value : ");
        float n2 = input.nextFloat();

        System.out.println("Enter operation you want to perform ! \nPress 1 for addition \nPress 2 for substraction \nPress 3 for multiplication \nPress 4 for division");
        int operation = input.nextInt();

        input.close();

        float ans = calculate(n1, n2, operation);

        if(ans == Integer.MAX_VALUE){
            System.out.println("Something went wrong !");
        }else {
            System.out.println("Answer : " + ans);
        }
    }
}
