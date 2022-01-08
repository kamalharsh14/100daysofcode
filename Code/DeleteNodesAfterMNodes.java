import java.util.*;

public class DeleteNodesAfterMNodes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LL list = new LL();
        DeleteNodesAfterMNodes ob = new DeleteNodesAfterMNodes();
        int n = in.nextInt();
        for(int i = 0 ; i < n ; i ++){
            int data = in.nextInt();
            list.insert(data);
        }
        LL.Node head = list.gethead();
        int M = in.nextInt();
        int N = in.nextInt();
        ob.linkdelete(head, M, N);
        list.display();
        in.close();
    }

    public void linkdelete(LL.Node head, int M, int N){
        if(head == null){
            return;
        }
        int n = 1, m = N;
        LL.Node tem = head;
        while(tem != null){
            if(n == M){
                LL.Node p = tem;
                while(p != null && m-- > 0){
                    p = p.next;
                }
                if(p != null){
                    tem.next = p.next;
                }
                else{
                    tem.next = p;
                }
                n=0;
                m=N;
            }
            n++;
            tem=tem.next;
        }
    }
}