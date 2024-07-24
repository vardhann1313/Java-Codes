import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter line : ");
        String line = input.nextLine();
        input.close();

        String [] data = line.split(" ");
        Set<String> ans = new HashSet<>();

        for(int i = 0 ; i< data.length ; i++){
            for(int j = i+1 ; j<data.length ; j++){
                if(data[i].trim().equals("")){
                    continue;
                }
                if((data[i].trim()).equalsIgnoreCase(data[j].trim())){
                    ans.add(data[i]);
                }
            }
        }

        System.out.println(ans);

    }
}