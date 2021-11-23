package Code;
import java.util.*;

public class intersection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        intersection ob = new intersection();
        Node head_first=  null;
        Node head_second = null;
        System.out.print("\nEnter elements of first List:");
        for(int i = 1; i > 0 ; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                head_first = ob.first(n,head_first);
            }
        }
        System.out.print("\nEnter elements of second List:");
        for(int i = 1; i > 0 ; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                head_second = ob.second(n, head_second);
            }
        }
        System.out.println("First List: ");
        ob.display(head_first);
        System.out.println("Second List: ");
        ob.display(head_second);
        System.out.println("Intersection List: ");
        Node headnode = ob.intersec(head_first, head_second);
        ob.display(headnode);
        
        
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

    Node second(int data, Node head){
        Node s = new Node(data);
        if(head == null){
            head = s;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = s;
        }
        return head;
    }

    Node first(int data, Node head){
        Node s = new Node(data);
        if(head == null){
            head = s;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = s;
        }
        return head;
    }

    Node intersec(Node head1, Node head2){
        Node headnode = null;
        Node first = head1;
        Node second = head2;
        Node temp = headnode;
        
        while(first != null && second != null){
            if(first.data == second.data){
                if(headnode == null){
                    Node add = new Node(first.data);
                    headnode = add;
                    temp = headnode;
                }
                else{
                    while(temp.next != null){
                        temp = temp.next;
                    }
                    Node add = new Node(first.data);
                    temp.next = add;
                }
                first = first.next;
                second = second.next;
            }
            else{
                if(first.data < second.data){
                    first = first.next;
                }
                else{
                    second=  second.next;
                }
            }
        }
        return headnode;
    }

    void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
}