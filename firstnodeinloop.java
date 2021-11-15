import java.util.Scanner;

public class firstnodeinloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        firstnodeinloop ob = new firstnodeinloop();
        for(int i = 1 ; i > 0; i ++){
            int n = in.nextInt();
            if(n == -1){
                break;
            }
            else{
                ob.insert(n);
            }
        }
        System.out.print("Create Cycle at: "); int n = in.nextInt();
        ob.createcycle(n);
        Node s = ob.loop();
        System.out.println(s.data);
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

    public void createcycle(int pos){
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

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("->Null");
    }

    Node loop(){
        Node first = null;;
        Node fastptr = head;
        Node slowptr = head;

        while(fastptr.next != null && fastptr.next.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr){
                break;
            }
        }
        if(slowptr == head){
            while(fastptr.next != slowptr){
                fastptr = fastptr.next;
            }
            first = fastptr.next;
        }
        else if(slowptr == fastptr){
            fastptr = head;
            while(slowptr.next != fastptr.next){
                slowptr = slowptr.next;
                fastptr = fastptr.next;
            }
            first = slowptr.next;
        }
        return first;
    }
}