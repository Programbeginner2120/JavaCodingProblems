//URL: https://leetcode.com/problems/reverse-linked-list/

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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        List<Integer> nodeList = new ArrayList<>();
        ListNode tempNode = head;
        while (tempNode != null){
            nodeList.add(tempNode.val);
            tempNode = tempNode.next;
        }
        int start = 0;
        int end = nodeList.size() - 1;
        int temp;
        while (start < end){
            temp = nodeList.get(start);
            nodeList.set(start, nodeList.get(end));
            nodeList.set(end, temp);
            start++;
            end--;
        }
        int idx = 0;
        tempNode = head;
        while (tempNode != null){
            tempNode.val = nodeList.get(idx);
            tempNode = tempNode.next;
            idx++;
        }
        return head;
    }
}