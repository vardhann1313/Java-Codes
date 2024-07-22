public class Pattern_16 {
    public static void main(String[] args) {
        for(int i = 0 ; i<7 ; i++){
            for(int j = 0 ; j < (4-i) ; j++){
                System.out.print("*  ");
            }

            for(int j = 0 ; j < (i-2) ; j++){
                if(i == 7/2){
                    continue;
                }
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
