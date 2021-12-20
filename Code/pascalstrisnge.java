import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalstrisnge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, temp = null;


        for(int i = 0 ; i < n ; i++){
            row = new ArrayList<Integer>();
            for(int j = 0 ; j <= i ; ++j){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(temp.get(j-1)+ temp.get(j));
                }
            }
            temp = row;
            res.add(row);
        }
        System.out.println(res);
        in.close();
    }
}
