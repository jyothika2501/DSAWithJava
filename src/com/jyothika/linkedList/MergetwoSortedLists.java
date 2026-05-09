/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node head = null;
        // edge cases where one of the lists is empty
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        // finding head
        if(head1.data < head2.data) {
            head = head1;
            head1 = head1.next;
        } else {
            head = head2;
            head2 = head2.next;
        }
        // starting curr from head
        Node curr = head;
        while(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        // attach remaining elements from head1/head2 to the list
        if(head1 != null) curr.next = head1;
        else curr.next = head2;;
        return head;
    }
}