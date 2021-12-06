import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a[] = new String[n];
        int k = a.length;
        for(int i = 0 ; i < n ; i++){
            a[i] = in.nextLine();
        }
        int j = n-1, flag = 1;
        for (int i = 0; i < n / 2; i++) {
            if(a[i] != a[j--]){
                flag =  0;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Palindrome");
        }
        in.close();
    }
}
