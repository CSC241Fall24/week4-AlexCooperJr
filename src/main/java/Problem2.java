public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        ListNode pointer = head;
        int count=0;

        if(position==1){
            ListNode insert = new ListNode(val);
            insert.next=head;
            return insert;
        }

        while(pointer!=null){
            count+=1;
            pointer=pointer.next;
        }

        pointer = head;
        if((position>count)){
            while(pointer.next!=null){
                pointer=pointer.next;
            }
            ListNode insert= new ListNode(val);
            pointer.next=insert;
            return head;
        }

        else{
            for(int i=1;i<position-1;i++){
                pointer=pointer.next;
            }
            ListNode insert= new ListNode(val);
            insert.next=pointer.next;
            pointer.next = insert;
            return head;
        }
    }
}