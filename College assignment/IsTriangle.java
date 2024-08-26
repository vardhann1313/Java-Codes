public class IsTriangle {

    static double calcDistance(int x1, int x2, int y1, int y2){
        return Math.abs(Math.round(Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1), 2)))*100.0)/100.0);
    }

    static boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        boolean ans = false ;

        double A = calcDistance(x1, x2, y1, y2);
        double B = calcDistance(x1, x3, y1, y3);
        double C = calcDistance(x2, x3, y2, y3);

        if(((A+B)>C) && ((A+C)>B) && ((B+C)>A)){
            ans = true ;
        }
        return ans ;
    }


    public static void main(String[] args) {

        System.out.println("Is triangle : " + isTriangle(-1, -1, 0, 1, 2, 5));
    }
}
