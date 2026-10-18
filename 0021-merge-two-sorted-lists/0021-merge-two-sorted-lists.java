
class Solution {
    public ListNode mergeTwoLists(ListNode L1, ListNode L2) {
        ListNode Dummy = new ListNode(-1);
        ListNode temp = Dummy;

        while(L1 != null && L2 != null){
            if(L1.val <= L2.val){
                temp.next = L1;
                L1 = L1.next;
            }else{
                temp.next = L2;
                L2 = L2.next;
            }
            temp = temp.next;
        }
             if(L1 != null){
                temp.next = L1;
            }else{
                temp.next = L2;
            }
            return Dummy.next;
    }
}