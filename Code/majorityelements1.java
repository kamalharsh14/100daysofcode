import java.util.HashMap;
import java.util.Scanner;

public class majorityelements1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < n ; i ++){
            if(map.containsKey(a[i])){
                int count = map.get(a[i]);
                map.put(a[i], ++count);
            }
            else{
                map.put(a[i], 1);
            }
        }
        
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            if(map.get(a[i]) > n/2){
                res =  a[i];
            }
        }
        System.out.println(res);
        in.close();
    }
}