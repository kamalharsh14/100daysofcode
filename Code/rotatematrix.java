import java.util.*;

class rotatematrix{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int matrix[][] = new int[n][m];

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j < m ; j ++){
                matrix[i][j] = in.nextInt();
            }
        }
        rotatematrix ob = new rotatematrix();
        ob.rotate(matrix);
        System.out.println("==============");
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j < m ; j ++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}