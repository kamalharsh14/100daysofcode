package Code;
import java.util.*;

public class negativepositive {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];

    //inserting values into the array
    for(int i = 0; i < n ; i ++){
        arr[i] = in.nextInt();
    }
    int j = 0;
    for(int i = 0 ; i < n ; i ++){
        if(arr[i] < 0){
            if(i != j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
    }

    for(int i = 0; i < n ; i ++){
        System.out.print(arr[i]+" ");
    }
    in.close();
}
}