class Solution {
    Boolean[][][] dp;
    public boolean hasValidPath(char[][] grid) {
        int n = grid.length,m=grid[0].length;
        if(n%2==m%2) return false;
        if(grid[0][0]==')' || grid[n-1][m-1]=='(') return false;
        dp = new Boolean[n][m][n+m-1];
        return fun(grid,0,0,0,0);
    }
    public boolean fun(char[][] grid,int i,int j,int open,int close){
        if(close>open) return false;
        if(i==grid.length-1 && j==grid[0].length-1) return open==close+1;

        if(dp[i][j][open-close]!=null) return dp[i][j][open-close];

        int leftLen = grid.length-i-1 + grid[0].length-j;
        if(open>close+leftLen) return false;
        
        int[] r = {0,1};
        int[] c = {1,0};
        for(int k=0 ; k<2 ; k++){
            int nr = i+r[k];
            int nc = j+c[k];
            if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length) continue;
            int op = (grid[i][j]=='(')?1:0;
            int cl = (grid[i][j]==')')?1:0;
            if(fun(grid,nr,nc,open+op,close+cl)) return dp[i][j][open-close]= true;
        }
        return dp[i][j][open-close]=false;
    }
}