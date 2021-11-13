import java.util.*;
public class delnode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        delnode ob = new delnode();
        Node h = null;
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                h = ob.insert(n);
            }
        }
        System.out.println("\nOriginal:");
        ob.display(h);
        System.out.println("\nUpdated:");
        Node r = ob.delete();
        ob.display(r);
        
        in.close();
    }

    class Node{
        Node next;
        
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    Node insert(int data){
        Node insert=  new Node(data);
        if(head == null){
            head = insert;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = insert;
        }
        return head;
    }
    Node rev(Node head){
        Node curr = head;
        Node nex = curr.next;
        Node prev = null;

        while(curr != null){
            nex = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nex;
        }
        return prev;
    }

    Node delete(){
        Node temp = rev(head);
        Node curr = temp;
        Node prev = temp;
        int ma = temp.data;
        temp = temp.next;

        while(temp != null){
            if(temp.data >= ma){
                ma = temp.data;
                prev = temp;
                temp = temp.next;
            }
            else{
                prev.next = temp.next;
                temp = prev.next;
            }
        }
        return rev(curr);
    }

    void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}