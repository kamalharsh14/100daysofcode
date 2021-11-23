package Code;
import java.util.*;
public class reverseDLL {
    
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail=  null;

    void insert(int data){
        Node add = new Node(data);
        if(head == null){
            head = add;
            head.prev = null;
            head.next = null;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            add.prev = temp;
            temp.next = add;
        }
    }
    void reverse(){
        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        if (temp != null) {
            head = temp.prev;
        }
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        reverseDLL ob = new reverseDLL();
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();

            if(n == -1){
                break;
            }
            else{
                ob.insert(n);
            }
        }
        ob.display();
        ob.reverse();
        ob.display();
        in.close();
    }
}