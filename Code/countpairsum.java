import java.util.*;

public class countpairsum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        //inserting values into the array.
        for(int i = 0 ; i < n; i ++){
                a[i] = in.nextInt();
        }

        int sum = in.nextInt();
        int ans = 0;
        //creating Hashmap
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i = 0 ; i < n; i ++){
            int b = sum - a[i];
            if(map.containsKey(b)){
                ans = ans + map.get(b) + 1;
                map.put(a[i],map.get(b) + 1);
            }
            map.put(a[i],1);
        }

        System.out.println(map);
        System.out.println(ans);
    
        in.close();
    }
}