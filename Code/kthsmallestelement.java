package Code;
import java.util.*;

public class kthsmallestelement{

    //main funtion
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); //size of array
        int arr[] = new int[n];

        //inserting values into the array
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }

        int k = in.nextInt(); //Nth smallest number 

        Arrays.sort(arr); //Sorting Array
    
        System.out.println(arr[k-1]);

        in.close();
    }
}