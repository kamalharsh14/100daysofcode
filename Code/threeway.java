import java.util.*;

public class threeway{

    //main funtion
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); //size of array
        int arr[] = new int[n];

        //inserting values into the array
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }

        int a =  in.nextInt();
        int b =  in.nextInt();

        int l = 0;
        int r = n-1;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i] < a){
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l++;
            }
            else if(arr[i] > b){
                int temp = arr[i];
                arr[i] = arr[r];
                arr[r] = temp;
                r--;
                i--;
            }
        }

        for(int i = 0 ; i < n ; i ++){
            System.out.print(arr[i]+" ");
        }

        in.close();
    }
}