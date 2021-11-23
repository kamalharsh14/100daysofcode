package Code;
import java.util.*;
public class middle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        middle ob = new middle();
        Node h = null; Node m;
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
        System.out.println("\nMiddle: ");
        m = ob.mid(h);
        ob.display(m);
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
    Node mid(Node head){
        Node temp = head;
        int counter = 0;
        Node mid = null;
        while(temp != null){
            temp = temp.next;
            counter++;
        }
        temp = head;
        int middle = counter / 2;
        if(middle >= 1){
            while(middle-- > 0){
                temp = temp.next;
                mid = temp;
            }
        }
        else{
            mid = temp;
        }
        return mid;
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