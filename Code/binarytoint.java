import java.util.*;
public class binarytoint {

    public static void main(String[] args) {
        LL newlist = new LL();
        Scanner in = new Scanner(System.in);
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                newlist.insert(n);
            }
        }
        newlist.display();
        int ans = convertbinarytoint(newlist.gethead());
        System.out.println(ans);
        in.close();
    }

    public static int convertbinarytoint(LL.Node head){

        LL.Node temp;
        int ans=0;
        for(temp = head; temp != null; temp = temp.next){
            ans=(ans<<1) + temp.data;
        }
        return ans;

    }
}