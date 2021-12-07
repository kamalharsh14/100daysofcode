import java.util.HashMap;
import java.util.Scanner;

public class duplicatechar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < n ; i++) {
            if(map.containsKey(s.charAt(i))){
                int temp = map.get(s.charAt(i));
                map.put(s.charAt(i), ++temp);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        System.out.println(map);
        
        in.close();
    }
}
