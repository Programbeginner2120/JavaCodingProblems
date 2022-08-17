//URL: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class LowestCommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode currentNode = root;
        boolean shouldContinue = true;
        while (shouldContinue){
            if (currentNode.val == p.val){
                return p;
            }
            if (currentNode.val == q.val){
                return q;
            }
            if (p.val < currentNode.val && q.val > currentNode.val || p.val > currentNode.val && q.val < currentNode.val){
                return currentNode;
            }
            if (p.val < currentNode.val && q.val < currentNode.val && currentNode.left != null){
                currentNode = currentNode.left;
            }
            else if (p.val > currentNode.val && q.val > currentNode.val && currentNode.right != null){
                currentNode = currentNode.right;
            }
            else{
                shouldContinue = false;
            }
        }
        return null;
    }
}