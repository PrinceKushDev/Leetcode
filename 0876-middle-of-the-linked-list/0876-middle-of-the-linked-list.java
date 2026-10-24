
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count  = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int ans =  count/2 ;
        temp = head;
        for(int i = 0; i < ans; i++){
            temp = temp.next;
        }
        return temp;
    }
}