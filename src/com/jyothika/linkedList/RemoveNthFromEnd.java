class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;
        ListNode prev = head;
        ListNode slow = head;
        ListNode fast = head;
        
        // single element list so remove that element
        if(head.next == null) {
            return null;
        }
        
        // move fast pointer to n steps
        // if total length is L and fast moved N steps ==> it has to move L-N steps to reach null. Since we are moving slow and fast at same pace, fast reached null meaning fast moved L-N steps which means slow also moved L-N steps i.e, it is at L-Nth position since it started from 0. which would be Nth position from end
        while(i < n) {
            fast = fast.next;
            i++;
        }
        
        // if fast becomes null after moving it to n steps, it means n is the length of the list, so we have to remove the first element because it will be nth from end
        if(fast == null) {
            head = head.next;
            // return head here so that it wont run the code after this
            return head; 
        }
        
        // now move slow and fast pointer by exactly one step
        while(fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        
        // at this point slow is at nth pos since fast reached null, prev is the before element
        prev.next = slow.next;
        return head;
    }
}