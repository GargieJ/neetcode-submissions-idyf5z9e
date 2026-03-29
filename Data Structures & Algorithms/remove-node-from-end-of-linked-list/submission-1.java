/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null){return head.next;}
        ListNode node=head;int size=1;
        while (node.next!=null){
            node=node.next;
            size+=1;}
        //node --> now at last node;
        int pos=1;
        ListNode curr=head;
        ListNode prev=null;
        ListNode nextNode=null;
        if (((size-n)+1)==1){return head.next;}
        while (pos!=((size-n)+1)){
            prev=curr;
            curr=curr.next;
            nextNode=curr.next;
            pos+=1;}
        prev.next=nextNode;
        return head;
    }
    
}
