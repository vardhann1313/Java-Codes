import java.util.Scanner;

public class Question_04 {

    static void sum_arr(float [] arr){
        float sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i] ;
        }
        System.out.println("Sum : " + sum);
    }
    
    public static void main(String ar[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the No. of numbers you want to enter : ");
        int n = input.nextInt();

        float [] values = new float[n]; 

        System.out.print("Enter numbers : ");
        for(int i = 0 ; i < values.length ; i++){
            values[i] = input.nextFloat();
        }
        input.close();

        sum_arr(values);
    }
}
