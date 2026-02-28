package Data_Structure;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static void main() {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        insert(head, 4);
        Node x = reverse(head);
        display(x);

    }

    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static void insert(Node head, int index){
        Node temp = head;
        int current_index = 0;

        while(temp != null){
            if(current_index == index-1){
                Node newNode = new Node(50);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
            current_index++;

        }
    }

    static void insertAtStart(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static void insertAtLast(Node head, int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp != null){
            if(temp.next == null){
                temp.next = newNode;
            }
            temp = temp.next;
        }
    }

    static void deleteHead(Node head){
        head = head.next;
    }

    static Node reverse(Node head){
        Node curr = head, prev = null, next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
