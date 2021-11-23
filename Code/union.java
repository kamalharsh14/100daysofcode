package Code;
import java.util.*;

public class union{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int m = in.nextInt();
        int b[] = new int[m];

        //inserting values into the array.
        for(int i = 0 ; i < n; i ++){
                a[i] = in.nextInt();
        }
        for(int i = 0 ; i < m; i ++){
            b[i] = in.nextInt();
        }

        //creating Hashmap
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i = 0 ; i < n; i ++){
            if(map.containsKey(a[i])){
                int count = map.get(a[i]);
                map.put(a[i], ++count);
            }
            else{
                map.put(a[i],1);
            }
        }
        
        for(int i = 0 ; i < m; i ++){
            if(map.containsKey(b[i])){
                int count = map.get(b[i]);
                map.put(b[i], ++count);
            }
            else{
                map.put(b[i],1);
            }
        }

        System.out.println(map);

        System.out.println(map.size());
        in.close();
    }
}