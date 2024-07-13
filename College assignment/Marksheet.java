import java.util.Scanner;

public class Marksheet {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        int marks[] = new int[5];
        int total_atkt = 0;
        int total_marks = 0;

        for (int i = 0; i<5; i++){
            boolean flag = true;
            int temp = 0;
            while(flag){
                System.out.println("Enter marks for subject "+ (i+1));
                temp = input.nextInt();
                if (temp > 100 || temp <0){
                    System.out.println("Invalid marks ... Re-enter marks !");
                } else {
                    marks[i] = temp;
                    break;
                }
            }

            total_marks += marks[i];

            if (marks[i] < 40){
                total_atkt += 1;
            }
        }
        input.close();

        if(total_atkt >= 3){
            System.out.println("You are Fail with " + total_atkt + " ATKT");
            System.out.println("Your total marks is " + total_marks);
        } else if (total_atkt > 0 && total_atkt < 3){
            System.out.println("You have ATKT in " + total_atkt + " subjects");
            System.out.println("Your total marks is " + total_marks);
        } else {
            int percentage = (total_marks/5);

            if(percentage >= 75 && percentage <= 100){
                System.out.println("You are pass with distinction \nYour percentage is " + percentage);
            } else if (percentage >= 60 && percentage < 75){
                System.out.println("You are pass with First division \nYour percentage is " + percentage);
            } else if (percentage >= 50 && percentage < 60){
                System.out.println("You are pass with Second division \nYour percentage is " + percentage);
            } else if (percentage >= 40 && percentage < 50){
                System.out.println("You are pass with Third division \nYour percentage is " + percentage);
            }
        }
    }
}