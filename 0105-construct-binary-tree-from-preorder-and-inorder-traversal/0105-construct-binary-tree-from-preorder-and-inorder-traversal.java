/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    private Map<Integer, Integer> inMap = new HashMap<>();
    private int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // inorder ke index map me store
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int inStart, int inEnd) {
        // base case
        if (inStart > inEnd) return null;

        // preorder se root
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        // inorder me root ka index
        int inRoot = inMap.get(rootVal);

        // left subtree
        root.left = build(preorder, inStart, inRoot - 1);

        // right subtree
        root.right = build(preorder, inRoot + 1, inEnd);

        return root;
    }
}
