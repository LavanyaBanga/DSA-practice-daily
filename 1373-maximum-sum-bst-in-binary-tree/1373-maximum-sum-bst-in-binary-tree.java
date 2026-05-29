class Solution {

    int ans = 0;

    class Info {

        boolean isBST;
        int min;
        int max;
        int sum;

        Info(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    public int maxSumBST(TreeNode root) {

        dfs(root);
        return ans;
    }

    public Info dfs(TreeNode root) {
        if(root == null) {
            return new Info(true, Integer.MAX_VALUE,
                                  Integer.MIN_VALUE, 0);
        }

        Info left = dfs(root.left);
        Info right = dfs(root.right);
        if(left.isBST &&
           right.isBST &&
           left.max < root.val &&
           root.val < right.min) {

            int sum = left.sum + right.sum + root.val;

            ans = Math.max(ans, sum);

            int mn = Math.min(root.val, left.min);
            int mx = Math.max(root.val, right.max);

            return new Info(true, mn, mx, sum);
        }
        return new Info(false, 0, 0, 0);
    }
}