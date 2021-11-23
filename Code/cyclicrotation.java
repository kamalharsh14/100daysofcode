package Code;
import java.util.*;
public class cyclicrotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Inserting elements in the array.
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }

        //rotating the array by one.
        int temp = a[n-1];
        for(int i = n-1 ; i > 0 ; i --){
            a[i] = a[i-1];
        }
        a[0] = temp;

        //displaying new Array.
        for(int i = 0 ; i < n ; i ++){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}