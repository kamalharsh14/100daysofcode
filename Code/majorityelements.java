import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class majorityelements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ; i < n ; i ++){
            if(map.containsKey(a[i])){
                int count = map.get(a[i]);
                map.put(a[i], ++count);
            }
            else{
                map.put(a[i], 1);
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(map.get(a[i]) > n/3){
                list.add(a[i]);
            }
        }

        List<Integer> newList = list.stream()
                                      .distinct()
                                      .collect(Collectors.toList());

        System.out.println(newList);
        in.close();
    }
}