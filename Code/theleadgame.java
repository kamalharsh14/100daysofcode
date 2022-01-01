import java.util.*;

public class theleadgame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0 ; int r = 0 ;
        int w[] = new int[n];
        int l[] = new int[n];
        for(int i = 0 ; i < n; i++){
            int si = in.nextInt();
            int ti = in.nextInt();
            m = m + si;
            r = r + ti;
            if(m > r){
                l[i] = m - r;
                w[i] = 1;
            }
            if(m < r){
                l[i] = r - m;
                w[i] = 2;
            }
        }
        int copy = 0, max = 0;
        for(int i = 0; i < n; i++){
            if(max < l[i]){
                max = l[i];
                copy = i;
            }
        }
        System.out.println(w[copy]+" "+l[copy]);
        in.close();
    }
}
