package Chapter2;

/**
 * Created by srujithpoondla on 4/6/17.
 */
public class Palindrome {
    public static void main(String[] args) {
        Node list = new Node(1);
        list.next =new Node(2);
        list.next.next = new Node(2);
        list.next.next.next=new Node(2);
        list.next.next.next.next= new Node(1);
        Node res = reverse(list);
        System.out.println(compare(list,res));
    }

    private static boolean compare(Node list, Node res) {
        while (list!=null||res!=null){
            if(list.data!=res.data){
                return false;
            }
            list = list.next;
            res = res.next;
        }
        return true;
    }

    private static Node reverse(Node list) {
        Node head=null;
        while (list!=null){
            Node n = new Node(list.data);
            n.next=head;
            head=n;
            list = list.next;
        }
        return head;
    }
}
