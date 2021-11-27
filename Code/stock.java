import java.util.*;

public class stock{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int sum = 0;

        //inserting values into the array.
        for(int i = 0 ; i < n; i ++){
                a[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < a.length ; i ++){
            if(min > a[i]){
                min = a[i];
            }
            else if(sum < (a[i] - min)){
                sum = a[i] - min;
            }
        }
        System.out.println(sum);
        in.close();
    }
}