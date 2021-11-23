package Code;
import java.util.*;

public class chocolate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        //inserting values int the array.
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i+m-1 < n; i++){
            if(min > (arr[i + m - 1] - arr[i])){
                min =  arr[i + m - 1] - arr[i];
            }
        }

        System.out.println(min);
        in.close();
    }
}