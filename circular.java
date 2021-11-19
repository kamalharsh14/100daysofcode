import java.util.*;
public class circular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        circular ob = new circular();
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
        int pos = in.nextInt();
        ob.makeloop(pos);
        ob.displayloop();
        Boolean s = ob.isCircular(h);
        System.out.println("\nCircular Linked List? \n"+s);
        in.close();
    }

    void displayloop(){
        System.out.print("[");
        Node temp = head;
        while(temp.next != head){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print(temp.data+" -> ("+head.data+")]");
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    Node insert(int data){
        Node add = new Node(data);
        if(head == null){
            head = add;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = add;
        }
        return head;        
    }

    public void makeloop(int pos){
        Node temp = head;
        Node endnext = null;
        int c = 1;
        while(temp.next != null){
            if(c == pos){
                endnext = temp;
            }
            temp = temp.next;
            c++;
        }
        temp.next = endnext;
    }

    boolean isCircular(Node head)
    {
	Node temp = head;
	while(temp.next != head && temp.next != null){
	    temp = temp.next;
	}
	if(temp.next == head){
	    return true;
	}
	else{
	    return false;
	}
    }
}