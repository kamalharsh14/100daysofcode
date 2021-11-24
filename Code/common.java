import java.util.*;

public class common {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int a[] = new int[n1];
        int b[] = new int[n2];
        int c[] = new int[n3];

        //inserting values into the array.
        for(int i = 0 ; i < n1 ; i ++){
            a[i] = in.nextInt();
        }

        for(int i = 0 ; i < n2 ; i ++){
            b[i] = in.nextInt();
        }

        for(int i = 0 ; i < n3 ; i ++){
            c[i] = in.nextInt();
        }

        int i = 0, j = 0, k = 0;
  
        while (i < n1 && j < n2 && k < n3)
        {
            if (a[i] == b[j] && b[j] == c[k]){
                   System.out.print(a[i]+" ");
                   i++; j++; k++;
                }
  
             else if (a[i] < b[j])
                 i++;
  
             else if (b[j] < c[k])
                 j++;
  
             else
                 k++;
        }

        in.close();
    }
}