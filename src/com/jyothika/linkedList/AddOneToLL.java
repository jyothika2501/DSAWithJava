/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
A number is represented in linked list such that each digit corresponds to a node in linked list. The task is to add 1 to it.
 
Input: head: 2 -> 1 -> 6 -> 9
Output: head:  2 -> 1 -> 7 -> 0
Explanation: Adding 1 to number represented by Linked List = 2169 + 1 = 2170
*/

class Solution {
    public Node addOne(Node head) {
        // reverse the linked list
        Node newHead = reverseList(head);
        Node curr = newHead;
        
        while(curr != null) {
            // if you encounter 9, then immediately make that value to 0 and go to next node. since adding 1 to 9 gives 0 anyway in units place
            if(curr.data == 9) {
                curr.data = 0;
                // if we reach end node, then we need to add one more node which is 1. Ex: 999
                if(curr.next == null) {
                    Node newNode = new Node(1);
                    curr.next = newNode;
                    break;
                }
                curr = curr.next;
            }
            // if we encounter a number other than 9, we just increment the value and break so that our task is finished and we exit from the program 
            else {
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