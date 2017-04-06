package Chapter2;

/**
 * Created by srujithpoondla on 4/6/17.
 */
public class DeleteMiddleNode {
    public static void main(String[] args) {
        Node list = new Node(1);
        list.next =new Node(2);
        list.next.next = new Node(2);
        list.next.next.next=new Node(3);
        Node del = list.next.next;
        Node res = delNode(del);
        while (list!=null){
            System.out.println(list.data);
            list=list.next;
        }
    }

    public static Node delNode(Node list) {
        Node head= list;
        Node curr = list;
        curr.data = list.next.data;
        curr.next = curr.next.next;
       return head;
    }
}
