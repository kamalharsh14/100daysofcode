import java.util.Arrays;
import java.util.Scanner;

public class mergetwosortedarrsys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int nums1[] =  new int[n]; 
        for(int i = 0 ; i < n ; i ++){
            nums1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int nums2[] =  new int[m];
        for(int i = 0 ; i < m ; i ++){
            nums2[i] = in.nextInt();
        }

        for(int i = 0 ; i < m ; i ++){
            nums1[(n-m)+i] = nums2[i];
        }

        Arrays.sort(nums1);
        System.out.print("[");
        for(int i = 0 ; i < n ; i ++){
            if(i == n-1){
                System.out.print(nums1[i]);
            }
            else{
                System.out.print(nums1[i]+",");
            }
        }
        System.out.print("]");
        in.close();
    }
}