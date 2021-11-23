package Code;
import java.util.Scanner;

public class reverseknodes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        reverseknodes ob = new reverseknodes();
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
        System.out.println("Original:");
        ob.display(h);
        System.out.print("Enter K: ");
        int k = in.nextInt();
        System.out.println("\nReversed:");
        Node he = ob.reverse(h,k);
        ob.display(he);
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

    void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    Node reverse(Node head, int k){
        Node curr = head;
        Node nex = curr.next;
        Node prev = null;
        int c = 0;
        while(curr != null && c < k){
            nex = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nex;
            c++;
        }
        if(nex != null){
            head.next=  reverse(nex, k);
        }

        return prev;
    }
}
