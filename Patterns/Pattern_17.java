public class Pattern_17 {
    public static void main(String[] args) {
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<7 ; j++){
                if(j >= (3-i) && j <= (3+i)){
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
