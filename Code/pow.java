import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int n = in.nextInt();
        System.out.println(x+" to the power "+n+" is: "+myPow(x, n));
        in.close();
    }
    public static double myPow(double x, int n) {
        long nn = n;
        double ans = 1.00;
        if(nn < 0){
            nn = nn * -1;
        }
        while(nn > 0){
            if(nn % 2 == 0){
                x = x * x;
                nn = nn/2;
            }
            else{
                ans = ans * x;
                nn = nn -1;
            }
        }   
        if(n<0) ans = (double)(1.0) / (double)(ans); 
        return ans;
    }
}
