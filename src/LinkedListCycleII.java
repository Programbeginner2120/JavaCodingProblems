//URL: https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleII {
    private boolean hasCycle(ListNode rabbit, ListNode turtle){
        while (rabbit != null && turtle != null){
            turtle = turtle.next;
            rabbit = rabbit.next != null ? rabbit.next.next : null;
            if (rabbit != null && rabbit.equals(turtle)){
                return true;
            }
        }
        return false;
    }
    public ListNode detectCycle(ListNode head) {
        boolean hasCycle = this.hasCycle(head, head);
        if (hasCycle){
            ListNode start = head;
            ListNode end = start;
            ListNode temp = start;
            int length = 0;
            int currLength;
            while (true){
                currLength = 0;
                end = end.next;
                while (!temp.equals(end)){
                    temp = temp.next;
                    currLength++;
                }
                if (currLength <= length){
                    return temp;
                }
                length = currLength;
                temp = start;
            }
        }
        return null;
    }
}