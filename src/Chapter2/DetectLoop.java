package Chapter2;

/**
 * Created by srujithpoondla on 4/6/17.
 */
public class DetectLoop {
    public static void main(String[] args) {
        Node list = new Node(1);
        list.next =new Node(2);
        list.next.next = new Node(3);
        list.next.next.next=new Node(4);
        list.next.next.next.next= new Node(3);
        System.out.println(detectLoop(list));
    }

    private static boolean detectLoop(Node list) {
        Node slow = list;
        Node fast = list;
        while (fast!=null&&fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow=list;
                return true;
            }
        }
        if(fast==null||fast.next==null){
            return false;
        }
        while (slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);
        return false;
    }
}
