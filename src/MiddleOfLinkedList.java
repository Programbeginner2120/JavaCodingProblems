//URL: https://leetcode.com/problems/middle-of-the-linked-list/

import java.util.ArrayList;

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
class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode temp = head;
        while (temp != null){
            nodeList.add(temp);
            temp = temp.next;
        }
        return nodeList.get(nodeList.size() / 2);
    }
}