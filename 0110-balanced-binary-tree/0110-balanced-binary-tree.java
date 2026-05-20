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
class Solution {

    static class Pair {
        int height;
        boolean isBalanced;
    }

    public boolean isBalanced(TreeNode root) {
        return check(root).isBalanced;
    }

    private Pair check(TreeNode root) {

        if (root == null) {
            Pair base = new Pair();
            base.height = -1;
            base.isBalanced = true;
            return base;
        }

        Pair left = check(root.left);
        Pair right = check(root.right);

        Pair myAns = new Pair();

        myAns.height = Math.max(left.height, right.height) + 1;

        boolean diffOk = Math.abs(left.height - right.height) <= 1;

        myAns.isBalanced = left.isBalanced && right.isBalanced && diffOk;

        return myAns;
    }
}