// Problem1.java

public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        //for empty first list
        if(l1==null){
            return l2;}
        //for empty second list
        if(l2==null){
            return l1;
        }
        
        ListNode tail1=l1;
        ListNode pointer=l1;
    

        while(pointer.next!=null){
            tail1 = pointer.next;
            pointer=pointer.next;
        }

        pointer = l2;

        while(pointer.next!=null){
            int num = pointer.val;
            tail1.next = new ListNode(num);
            tail1.next.next=pointer.next;
            pointer=pointer.next;


        }
        return l1;
    }
}