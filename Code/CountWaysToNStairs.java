import java.util.*;
public class CountWaysToNStairs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(countWays(in.nextInt()));
        in.close();
    }
    public static Long countWays(int n) {
        return (n/2L)+1;
    }
}