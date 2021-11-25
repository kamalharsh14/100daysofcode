import java.util.*;

public class subset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int a1[] = new int[n];
        int a2[] = new int[m];

        //inserting values into the array.
        for(int i = 0 ; i < n ; i ++){
            a1[i] = in.nextInt();
        }
        for(int i = 0 ; i < m ; i ++){
            a2[i] = in.nextInt();
        }
        
        //creating Hashmap
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i = 0 ; i < n; i ++){
            if(!map.containsKey(a1[i])){
                map.put(a1[i],1);
            }
        }

        int count = 0;
        for(int i = 0 ; i < m; i ++){
            if(map.containsKey(a2[i])){
                count++;
            }
        }

        if(count == m){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        in.close();
    }
}