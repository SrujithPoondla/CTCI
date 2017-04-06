package Chapter2;

/**
 * Created by srujithpoondla on 4/5/17.
 */
public class KthtoLastElement {
    public static void main(String[] args) {
        Node list = new Node(1);
        list.next =new Node(2);
        list.next.next = new Node(2);
        list.next.next.next=new Node(3);
        list.next.next.next.next= new Node(5);
        int k=2;
        Node res= kthToLast(list,k);
        System.out.println(res.data);

    }

    private static Node kthToLast(Node list,int k) {
        int len=1;
        Node lenlist=list;
        while (lenlist.next!=null){
            lenlist=lenlist.next;
            len = len +1;
        }
        System.out.println(len);
        int i=0;
        while(i<len-k-1){
            list = list.next;
            i=i+1;
        }
        return list;

    }
}
