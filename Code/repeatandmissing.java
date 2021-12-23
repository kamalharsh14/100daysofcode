import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repeatandmissing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        res.add(2);
        res.add(3);
        res.add(3);
        res.add(5);
        repeatedNumber(res);
        in.close();
    }

    public static void  repeatedNumber(final List<Integer> A) {
        int arr[] = new int[A.size()+1];
        for(int i = 0 ; i < A.size(); i++){
            arr[A.get(i)] = arr[A.get(i)]+ 1;
        }
        List<Integer> result = new ArrayList<Integer>();
        int repeated = 0;
        int missing = 0;
        for(int i = 1 ; i < A.size()+1; i ++){
            if(arr[i] > 1){
                repeated = i;
            }
            if(arr[i] == 0){
                missing = i;
            }
        }
        result.add( repeated);
        result.add( missing);
        System.out.println("Repeated Number: "+repeated);
        System.out.println("Missing NUmber: "+missing);
    }
}