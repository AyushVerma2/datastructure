package linklist;


public class Main {
    public static void main(String str[]){
        BasicOperation operation = new BasicOperation();
        MyNode first=new MyNode("first");
        MyNode second=new MyNode("second");
        MyNode third=new MyNode("third");
        operation.addNode(first);
        operation.addNode(second);
        operation.addNode(third);

        operation.display();
    }
}
