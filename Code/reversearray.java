package Code;
import java.util.*;
public class reversearray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int a[] = new int[n];
        
        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }

        int start = 0;
        int end = n-1;
        
        while(start < end){
            int t = a[start];
            a[start] = a[end];
            a[end] = t;
            start++;
            end--;
        }
        
        for(int i = 0 ; i < n ; i ++){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}