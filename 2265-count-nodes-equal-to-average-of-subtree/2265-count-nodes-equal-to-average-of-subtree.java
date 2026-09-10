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
    int gc = 0;
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        calc(root);
        return gc;
    }
    public void calc(TreeNode root){
        if(root==null) return;
        int ls = sum(root.left);
        int rs = sum(root.right);

        int lc = count(root.left);
        int rc = count(root.right);

        int fs = root.val+ls+rs;
        int fc = 1+lc+rc;

        int avg = (int) fs/fc;
        if(avg==root.val) gc++;

        calc(root.left);
        calc(root.right);
    }
    public int sum(TreeNode root){
        if(root==null) return 0;
        int l = sum(root.left);
        int r = sum(root.right);
        return root.val+l+r;
    }
    public int count(TreeNode root){
        if(root==null) return 0;
        int l = count(root.left);
        int r = count(root.right);
        return 1+l+r;
    }
}