
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count  = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int ans =  count/2 +1 ;
        temp = head;
        for(int i = 1; i < ans; i++){
            temp = temp.next;
        }
        return temp;
    }
}