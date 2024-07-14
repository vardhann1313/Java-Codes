public class Matrix_multiplication {
    static int[][] matrix_multiply(int [][] m1, int [][] m2){
        int [][] result = new int [3][3] ;
        int sum = 0 ;

        for (int i = 0 ; i < m1.length ; i++){
            for(int k = 0 ; k < m1[i].length ; k++){
                for( int j = 0 ; j < m1.length ; j++){
                    sum += m1[i][j] * m2[j][k] ;
                }
                result[i][k] = sum ;
                sum = 0 ;
            }
        }

        return result ;
    }

    public static void main(String ar[]){
        int [][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] m2 = {{1,2,3},{4,5,6},{7,8,9}};

        int [][] result = matrix_multiply(m1, m2);

        for(int i = 0 ; i < result.length ; i++ ){
            for(int j = 0 ; j < result[i].length ; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
