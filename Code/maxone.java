import java.util.*;

public class maxone{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int a[][] = new int[n][m];

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j < m ; j++){
                a[i][j] = in.nextInt();
            }
        }
        int max = 0;
        int x = -1;
        for(int i = 0 ; i < n ; i ++){
            int count = 0;
            for(int j = 0; j < m ; j++){
                if(a[i][j] == 1){
                    count++;
                }
            }
            if(count > max){
                max = count;
                x = i;
            }
        }

        System.out.println(x+" row has maximum number of 1's.");

        in.close();
    }
}