import java.util.Scanner;
import java.util.Stack;

public class LLpalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LL ob = new LL();
        for(int i = 0 ; i > -1; i++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                ob.insert(n);
            }
        }
        boolean flag = isPalindrome(ob.gethead());
        if(flag == true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        in.close();
    }

    public static boolean isPalindrome(LL.Node head) {
        LL.Node slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
 
        while (head != null) {
 
            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }
}