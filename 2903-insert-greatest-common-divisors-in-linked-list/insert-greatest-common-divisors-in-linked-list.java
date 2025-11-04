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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        int gcd =1;
        ListNode temp = head;
        while(temp != null && temp.next !=null){
            gcd = gcd(temp.val , temp.next.val);
            ListNode node = new ListNode(gcd);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
            
        }

        return head;
        
    }
    public static int gcd(int a, int b) {
        if (b == 0)
            return a; 
        return gcd(b, a % b);
    }
}