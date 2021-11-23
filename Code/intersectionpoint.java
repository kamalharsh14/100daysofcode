package Code;
import java.util.*;

public class intersectionpoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        intersectionpoint ob = new intersectionpoint();
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
        int headnode = ob.intersec(head_first, head_second);
        System.out.println(headnode);
        
        
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

    int intersec(Node head1, Node head2){
        Node first = head1;
        Node second = head2;
        int c1 = 0, c2 = 0;

        while(first != null){
            c1++;
            first = first.next;
        }

        while(second != null){
            c2++;
            second = second.next;
        }

        int diff = Math.abs(c1 - c2);
        first = head1;
        second = head2;
        if(c1 > c2){
            for(int i = 0 ; i < diff; i ++){
                first = first.next;
            }
        }
        else{
            for(int i = 0 ; i < diff; i++){
                second = second.next;
            }
        }
        
        while(first != second){
            first =first.next;
            second = second.next;
        }
        if(first != null){
            return first.data;
        }
        else{
            return -1;
        }
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