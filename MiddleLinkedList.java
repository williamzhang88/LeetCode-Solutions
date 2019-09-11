**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head)
    {
        int total = 0;
        ListNode bob = head;
        while(bob.next != null)
        {
            bob = bob.next;
            total++;
            
        }
        for(int i =0; i < (total + 1)/2; i++)
        {
            head = head.next;
        }
        return head;
    }
}
