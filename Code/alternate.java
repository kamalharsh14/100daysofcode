import java.util.Arrays;
import java.util.Scanner;

public class alternate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        
        int j = n-1;
        for(int i = 0 ; i < n ; i ++){
            if(a[i] % 2 == 0){
                int temp = a[i];
                a[i] = a[j];
                a[j++] = temp;
            }
        }

        for(int i = 0 ; i < n ; i ++){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}