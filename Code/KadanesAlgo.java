import java.util.*;
public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        //inserting values into the array.
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }

        long max = Integer.MIN_VALUE;
        int sum = 0;

        //applying kadane's algorithm
        for(int i = 0 ; i < n ; i ++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println(max);
        
        in.close();
    }
}