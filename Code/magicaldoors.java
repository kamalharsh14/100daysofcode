import java.util.*;
public class magicaldoors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            String s = in.next();
            int flip = 0;
            char ch = '1';
            for(int j = 0 ; j < s.length(); j++){
                if(s.charAt(j) != ch){
                    flip++;
                    ch = s.charAt(j);
                }
            }
            System.out.println(flip);
        }
        in.close();
    }    

    String flip(String s){
        String st = "";
        for(int i = 0 ; i < s.length(); i ++){
            if(s.charAt(i) == '1'){
                st = st + "0";
            }
            else if(s.charAt(i) == '0'){
                st = st + "1";
            }
        }
        return st;
    }
}