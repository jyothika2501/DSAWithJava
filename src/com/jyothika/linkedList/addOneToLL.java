/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // reverse the linked list
        Node newHead = reverseList(head);
        Node curr = newHead;
        
        while(curr != null) {
            if(curr.data == 9) {
                curr.data = 0;
                if(curr.next == null) {
                    Node newNode = new Node(1);
                    curr.next = newNode;
                    break;
                }
                curr = curr.next;
            } else {
                curr.data = curr.data + 1;
                break;
            }
        }
        // again reverse the list
        return reverseList(newHead);
    }
    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node temp = null;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}