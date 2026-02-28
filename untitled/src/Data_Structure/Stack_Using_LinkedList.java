package Data_Structure;

class Stack_Using_LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    static int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    static int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    static boolean isEmpty() {
        return top == null;
    }

    static void display(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        System.out.println(peek());
        System.out.println(pop());
        System.out.println(isEmpty());
        display();
    }
}
