//URL: https://leetcode.com/problems/binary-tree-level-order-traversal/

import java.util.List;
import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class BinaryTreeLevelOrderTraversal {
    private int getTreeHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = this.getTreeHeight(root.left);
        int right = this.getTreeHeight(root.right);
        if (left > right){
            return 1 + left;
        }
        return 1 + right;
    }
    private List<Integer> getCurrentLevel(TreeNode root, int level){
        List<Integer> left;
        List<Integer> right;
        List<Integer> res = new ArrayList<>();
        if (root != null){
            if (level == 1){
                res.add(root.val); // add leaf node
            }
            else if (level > 1){
                // recursively get nodes on desired level
                left = this.getCurrentLevel(root.left, level - 1);
                right = this.getCurrentLevel(root.right, level - 1);
                left.addAll(right);
                res.addAll(left);
                // add nodes from left and right together, add to level res and return
            }
        }
        return res;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> baseList = new ArrayList<>();
        List<Integer> curr;
        int height = this.getTreeHeight(root);
        for (int i = 1; i <= height; i++){ // get level for each level in tree
            curr = this.getCurrentLevel(root, i);
            baseList.add(curr);
        }
        return baseList;
    }
}