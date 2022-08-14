//URL: https://leetcode.com/problems/merge-two-sorted-lists/submissions/

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
class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = null;
        ListNode start = null;
        int value;
        int list1Val;
        int list2Val;
        ListNode currNode;
        while (list1 != null && list2 != null){
            list1Val = list1.val;
            list2Val = list2.val;
            if (list1Val < list2Val){
                value = list1Val;
                list1 = list1.next;
            }
            else{
                value = list2Val;
                list2 = list2.next;
            }
            currNode = new ListNode(value);
            if (merged != null){
                merged.next = currNode;
                merged = merged.next;
            }
            else{
                merged = currNode;
                start = merged;
            }
        }
        ListNode remainder = list1 != null ? list1 : list2;
        while (remainder != null){
            if (merged != null){
                merged.next = remainder;
                merged = merged.next;
            }
            else{
                merged = remainder;
                start = merged;
            }
            remainder = remainder.next;
        }
        return start;
    }
}

