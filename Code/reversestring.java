import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a[] = new String[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = in.nextLine();
        }
        int j = n-1;
        for (int i = 0; i < a.length / 2; i++, j--) {
            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}
