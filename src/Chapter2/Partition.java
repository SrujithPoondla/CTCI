package Chapter2;

/**
 * Created by srujithpoondla on 4/6/17.
 */
public class Partition {

    public static void main(String[] args) {
        Node list = new Node(4);
        list.next =new Node(1);
        list.next.next = new Node(5);
        list.next.next.next=new Node(3);
        list.next.next.next.next=new Node(2);
        Node partition = list.next.next;
        Node res = partition(list,partition);
        while (res!=null){
            System.out.println(res.data);
            res=res.next;
        }
    }

    private static Node partition(Node list, Node partition) {
        Node head =partition;
        Node tail = partition;
        while (list!=null){
            Node next = list.next;
            if(list.data>partition.data){
                tail.next=list;
                tail =  list;
            }else {
                list.next=head;
                head = list;
            }
            list=next;
        }
        tail.next=null;
        return head;
    }
}
