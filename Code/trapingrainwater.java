import java.util.*;

public class trapingrainwater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a[] = new int[n];
        int r[] = new int[n];
        int l[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }
        
        l[0] = a[0];
        for (int i = 1; i < n; i++)
            l[i] = Math.max(l[i - 1], a[i]);

        r[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--)
            r[i] = Math.max(r[i + 1], a[i]);

        long sum = 0;
        for (int i = 0; i < n; i++)
            sum += Math.min(l[i], r[i]) - a[i];

        System.out.println("Maximum Rainwater trapped = "+sum);
        in.close();
    }
}