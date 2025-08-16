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
    public ListNode rotateList1(ListNode head) {
        ListNode iterator=head;
        ListNode prev=null;
        while(iterator.next!=null){
            prev=iterator;
            iterator=iterator.next;
        }
        iterator.next=head;
        prev.next=null;
        return iterator;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        if(count==k){
            return head;
        }
        else if(count>k){
            for(int i=0;i<k;i++){
                head=rotateList1(head);
            }
        }else{
            int times=k%count;
            for(int i=0;i<times;i++){
                head=rotateList1(head);
            }
        }
        return head;
    }
}