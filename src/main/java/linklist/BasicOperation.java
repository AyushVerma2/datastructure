package linklist;

public class BasicOperation {

    MyNode head;

    void addNode(MyNode node) {
        if (null == head) {
            head = node;
            return;
        }
        MyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

    }

    void display() {
        MyNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class MyNode {
    String data;
    MyNode next;

    public MyNode(String data) {
        this.data = data;
    }
}