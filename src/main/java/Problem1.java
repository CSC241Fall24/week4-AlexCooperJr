// Problem1.java

import java.util.List;

public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        if(l1==null){
            return l2;}
        ListNode pointer=l1.next;
        ListNode tail=l1.next;
        while(pointer.next!=null){
            tail=pointer.next;
            pointer=pointer.next;
        }
        ListNode l3=l2;
        while(l3.next!=null){
            tail.next=l3;
        }
        return l1;
    }
}