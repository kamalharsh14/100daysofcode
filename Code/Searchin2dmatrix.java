import java.util.*;

public class Searchin2dmatrix{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();         //size of rows.
        int m = in.nextInt();         //size of columns.
        int a[][] = new int[n][m];

        //inserting elemnts in the array.
        for(int i = 0 ; i < n; i ++){
            for(int j = 0 ; j < m; j ++){
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter elemnt to be searched");
        int search = in.nextInt();    //element to be searched.

        int x = 0; int y = 0;         //'x' and 'y' used to store the coordinates of the element in the array.
        int flag = 0;                 //flag used for checking if number is present or not.
        int low = 0;                  //binary search variable.
        int high = n*m -1;            //binary search variable.


        //binary search
        while(low <= high){
            int mid = low + (high -low)/2;

            if(a[mid/m][mid%m] == search){
                flag = 1;
                x = mid/m; y = mid%m;
                break;
            }
            else if(a[mid/m][mid%m] > search){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }

        //printing array for better understanding of position.
        for(int i = 0 ; i < n; i ++){
            for(int j = 0 ; j < m; j ++){
                System.out.print(a[i][j]+" ");;
            }
            System.out.println();
        }

        //printing if element is present in the  given array or not.
        if(flag == 1){
            System.out.println("Element present at Position ("+x+","+y+").");
        }
        else{
            System.out.println("Element not present.");
        }
        in.close();
    }
}