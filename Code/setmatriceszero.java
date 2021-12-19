import java.util.*;
public class setmatriceszero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int matrix[][] = new int[n][n];

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        int row = n;
        int col = n;
        int column = 1;

        for(int i = 0 ; i < row ; i ++){
            for(int j = 1 ; j < col ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
            if(matrix[i][0] == 0){
                column = 0;
            }
        }

        for(int i = row-1; i >= 0; i--){
            for(int j = col-1; j >= 0 ; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            if(column == 0){
                matrix[i][0] = 0;
            }
        }

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(matrix[i][0]+" ");
            }
            System.out.println();
        }

        in.close();
    }
}
