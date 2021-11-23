package Code;
import java.util.*;
public class addtwoll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        addtwoll ob = new addtwoll();
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
        System.out.println("Resultant List: ");
        Node head = ob.add(head_first, head_second);        
        ob.display(head);
        
        
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

    Node add(Node head1, Node head2){
        Node head = null;
        Node first = rev(head1);
        Node second = rev(head2);
        int carry = 0;
        int sum = 0;
        int n = 0;

        while(first != null || second != null){
            if(first != null && second != null){
                n = first.data + second.data + carry;
            }
            else if(first == null && second != null){
                n = second.data + carry;
            }
            else if(second == null && first != null){
                n = first.data + carry;
            }
            carry = 0;
            if(n >= 10){
                sum = n%10;
                carry = n/10; 
                if(head == null){
                    Node add = new Node(sum);
                    head = add;
                }
                else{
                    Node temp = head;
                    Node add = new Node(sum);
                    while(temp.next != null){
                        temp = temp.next;
                    }
                    temp.next = add;
                }
            }
            else{
                if(head == null){
                    Node add = new Node(n);
                    head = add;
                }
                else{
                    Node temp = head;
                    Node add = new Node(n);
                    while(temp.next != null){
                        temp = temp.next;
                    }
                    temp.next = add;
                }
            }
            if(first != null){
                first = first.next;
            }
            if(second != null){
                second = second.next;
            }
        }
        if( carry > 0){
            if(head == null){
                Node add = new Node(carry);
                head = add;
            }
            else{
                Node temp = head;
                Node add = new Node(carry);
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = add;
            }
        }

        return rev(head);
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