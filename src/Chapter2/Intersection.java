package Chapter2;

/**
 * Created by srujithpoondla on 4/6/17.
 */
public class Intersection {
    public static void main(String[] args) {
        Node first = new Node(1);
        first.next =new Node(2);
        first.next.next = new Node(2);
        first.next.next.next=new Node(3);
        first.next.next.next.next= new Node(5);
        Node second = new Node(4);
        second.next =first.next.next;
        second.next.next=first.next.next.next;
        second.next.next.next=  first.next.next.next.next;
        Node res = findIntersection(first,second);
        if(res!=null){
        System.out.println(res.data);
        }else {
            System.out.println("no");
        }
    }

    private static Node findIntersection(Node first, Node second) {
        int firstlen=0;
        int i=0;
        int secondlen=0;
        Node firstNode= first, secondNode=second;
        while (firstNode.next!=null){
            firstlen=firstlen+1;
            firstNode  = firstNode.next;
        }
        while (secondNode.next!=null){
            secondlen=secondlen+1;
            secondNode = secondNode.next;
        }
        System.out.println(firstlen);
        System.out.println(secondlen);
        if(firstNode.data!=secondNode.data){
            return null;
        }else {
            if(firstlen>secondlen){
                while (i<firstlen-secondlen){
                    first =first.next;
                    i=i+1;
                }
            }else {
                while (i<secondlen-firstlen){
                    second =second.next;
                    i=i+1;
                }
            }
            while (first!=second){
                first=first.next;
                second=second.next;
            }
            return first;
        }

    }
}
