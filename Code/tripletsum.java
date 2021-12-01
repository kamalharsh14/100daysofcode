import java.util.HashMap;
import java.util.Scanner;

public class tripletsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }

        int x = in.nextInt();
        int ans = 0;

        for(int i = 0; i < n ; i ++){
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            int curr = x - a[i];

            for(int j = 0 ; j < n; j++){
                if(map.containsKey(curr - a[j])){
                    ans = 1;
                    break;
                }
                else{
                    map.put(a[j], 1);
                }
            }
        }

        System.out.println(ans);
        in.close();
    }
}