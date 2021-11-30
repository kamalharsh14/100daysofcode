import java.util.*;

public class median {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }

            Arrays.sort(a);
            int median;

            if (n % 2 == 1){
                median = a[(n/2)];
            }
            else{
                int m1 = n/2;
                int m2 = (n-1)/2;
                
                median = (a[m2] + a[m1])/2;
            }
        System.out.println(median);
        in.close();
    }
}
