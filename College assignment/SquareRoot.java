public class SquareRoot {

    static double squareRoot(int square, double start){

        if(Math.round(start*start) == square){
            return Math.round(start*100)/100.00 ;
        }else if(start*start > square){
            start = squareRoot(square, start - .01);
        }else{
            start = squareRoot(square, (start+1)); 
        }
        return start ;
    }
    public static void main(String[] args) {
        
        System.out.println(squareRoot(24, 0));
        
    }
}
