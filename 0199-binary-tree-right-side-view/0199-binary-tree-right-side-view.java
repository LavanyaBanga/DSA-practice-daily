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
    public List<Integer> rightSideView(TreeNode root) {
     List<Integer> ans=new ArrayList<>();//arraylist to store right elements
     if(root==null)return ans;
     Queue<TreeNode>q=new LinkedList<>();//queue for bfs travel
     q.offer(root);//adding root element to the queue
     while(!q.isEmpty()){
        int n=q.size();
        for(int i=0;i<n;i++){
            TreeNode curr=q.poll();//removing first element and storing it
            if(i==n-1){ //traversing till right element
                ans.add(curr.val);//storing right element to arraylist
            }
            if(curr.left!=null)q.offer(curr.left);
            if(curr.right!=null)q.offer(curr.right);

        }
     }
     return ans;
    }
}
