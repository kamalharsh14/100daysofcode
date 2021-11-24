 
import java.util.*;

public class firsttolast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        firsttolast ob = new firsttolast();
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                ob.insert(n);
            }
        }
        System.out.println("Original: ");
        ob.display();
        System.out.println("New: ");
        ob.move();
        ob.display();
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

    void insert(int data){
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
    }

    void move(){
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        Node c = temp.next;
        temp.next.next = head;
        temp.next = null;
        head =  c;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    
}
