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
    public boolean hasCycle(ListNode head) {
    int inf = Integer.MAX_VALUE;
    ListNode tail=head;
    if (tail==null){return false;}
       while (tail.next!=null){
            if (tail.next.val==inf){
                return true;
            }
            else{
                tail.val=inf;
                tail=tail.next;}
        }
       return false; 

    }
}
