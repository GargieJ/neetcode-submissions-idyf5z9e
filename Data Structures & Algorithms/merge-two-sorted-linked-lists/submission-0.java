class Solution {
    

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode sample = new ListNode(-1);
       ListNode tail = sample;
       ListNode a = list1;
       ListNode b = list2;


       while (a!=null && b!=null){
        if (a.val<=b.val){
            tail.next=a;
            a=a.next;
        }
        else{
            tail.next=b;
            b=b.next;
        }
        tail=tail.next;
        }
        if (a!=null){
            tail.next=a;
            
        }
        else{
            tail.next=b;
            
        }
        return sample.next;
       }
    }
