import java.util.Scanner;

public class searchinsortedarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            num[i] = in.nextInt();
        }
        int target = in.nextInt();

            int pos = -1;
            for(int i = 0 ; i < n; i ++){
                if(num[i] == target){
                    pos = i;
                    break;
                }
            }
        in.close();
    }
}