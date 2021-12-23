import java.util.Scanner;

public class findduplicatenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num[] = new int[n];

        for(int i = 0 ; i < n ; i ++){
            num[i] = in.nextInt();
        }

        int slow = num[0];
        int fast = num[0];

        do{
            slow = num[slow];
            fast = num[num[fast]];
        }while(slow != fast);

        fast = num[0];

        while(slow != fast){
            slow = num[slow];
            fast = num[fast];
        }

        System.out.println(slow);
        in.close();
    }
}