import java.util.*;
public class SquaresinNChessBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SquaresinNChessBoard ob = new SquaresinNChessBoard();
        int n = in.nextInt();
        System.out.println(ob.numberofsquares(n));
        in.close();
    }

    int numberofsquares(int n){
        if(n == 1){
            return 1;
        }
        else{
            return (n*n) + numberofsquares(n-1);
        }
    }
}