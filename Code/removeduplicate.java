package Code;
import java.util.*;

public class removeduplicate {
    
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

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void removeduplicateunsorted(){
        Node curr = head;
        Node prev = curr;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(curr.data, 1);
        curr = curr.next;
        while(curr != null){
            if(hm.containsKey(curr.data)){
                prev.next = curr.next;
            }
            else{
                hm.put(curr.data, 1);
                prev = curr;
            }
            curr = prev.next;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        removeduplicate ob = new removeduplicate();
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                ob.insert(n);
            }
        }
        System.out.println("Original:");
        ob.display();
        ob.removeduplicateunsorted();
        ob.display();
        in.close();
    }
}
