package Chapter2;

import java.util.*;
import java.util.concurrent.Semaphore;

/**
 * Created by srujithpoondla on 4/5/17.
 */

class Node{
    int data;
    Node next;
    public Node(int d) {
        data = d;
    }
}
public class RemoveDuplicates {
    public static void main(String[] args) {
        Node list = new Node(1);
        list.next =new Node(2);
        list.next.next = new Node(2);
        list.next.next.next=new Node(3);
        Node res= checkDup(list);
        while (res!=null){
            System.out.println(res.data);
            res=res.next;
        }
    }

    private static Node checkDup(Node list) {
        List<Integer> set = new ArrayList<>();
        Node prev = null;
        Node curr = list;
        while (curr.next!=null){
            if (set.contains(curr.data)){
                prev.next = curr.next;
                curr = curr.next;
            }else {
                set.add(curr.data);
                prev=curr;
                curr=curr.next;

            }
        }
        if(set.contains(curr)){
            prev.next=null;
        }
        return  list;
    }
}
