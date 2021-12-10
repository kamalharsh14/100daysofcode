import java.util.*;

public class deletenode{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LL list = new LL();
        deletenode ob = new deletenode();
        for(int i = 1 ; i > 0 ; i++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                list.insert(n);
            }
        }
        System.out.println("Entered List");
        list.display();
        System.out.println("Enter Node to be deleted");
        int n = in.nextInt();
        LL.Node temp = list.gethead();
        for(int i = 1 ; i < n ; i++){
            temp = temp.next;
        }
        ob.delNode(temp);
        System.out.println("Updated List");
        list.display();
        in.close();
    }

    public void delNode(LL.Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}