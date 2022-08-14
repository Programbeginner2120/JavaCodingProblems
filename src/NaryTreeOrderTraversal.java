//URL: https://leetcode.com/problems/n-ary-tree-preorder-traversal/

//// Definition for a Node.
//class Node {
//    public int val;
//    public List<Node> children;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//};

class NaryTreeOrderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> nodeList = new ArrayList<>();
        if (root != null){
            nodeList.add(root.val);
            for (Node child : root.children){
                nodeList.addAll(this.preorder(child));
            }
        }
        return nodeList;
    }
}