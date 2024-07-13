public class Quadratic_eq_solver {
    static float[] solver(int a, int b, int c ){
        float [] ans = new float[2];

        float D = ((b*b) - (4*a*c));

        if(D < 0){
            System.out.println("No real solution !");
            return ans ;
        } else {
            ans[0] = (-b - (float)(Math.sqrt(D)))/(2*a);
            ans[1] = (-b + (float)(Math.sqrt(D)))/(2*a);
        }

        return ans ;
    }

    public static void main (String ar[]){
        float [] ans = solver(4, -5, -12);

        System.out.println("Root 1 : " + ans[0] + " || Root 2 : " + ans[1]);
    }
}
