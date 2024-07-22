public class Pattern_02 {
    public static void main(String[] args) {
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<7 ; j++){
                if(j >= (3-i) && j <= (3+i)){
                    if((j-i)%2 == 0){
                        System.out.print("   ");
                    } else {
                        System.out.print((i+1) + "  ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
