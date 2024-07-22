public class Pattern_05 {
    public static void main(String[] args) {
        for(int i = 0 ; i<4 ; i++ ){
            for(int j = 0 ; j<=i ; j++){
                System.out.print(((i*(i+1))/2 + j + 1) + "  ");
            }
            System.out.println("");
        }
    }
}
