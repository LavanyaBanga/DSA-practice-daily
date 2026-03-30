class Solution {

        

	public int longestCommonSubsequenceMEMO(String s, String t) {
		
		int dp[][] =  new int[s.length()][t.length()];
		for (int[] is : dp) {
			Arrays.fill(is, -1);
		}
		int ans = rec(s,t,0,0,dp);
		
		return ans;
	}

	private int rec(String s, String t, int i, int j,int dp[][]) {
		// TODO Auto-generated method stub
		if(i>=s.length() || j>= t.length()) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		if(s.charAt(i) ==  t.charAt(j)) {
			return dp[i][j]=  1 + rec(s, t, i+1, j+1,dp);
		}
		else {
			int skipS = rec(s, t, i+1, j,dp);
			int skipT = rec(s, t, i, j+1,dp);
			return dp[i][j]=  Math.max(skipS, skipT);
		}
		
	}
	
	 public int longestCommonSubsequence(String s, String t) {
		 int dp[][] =  new int[s.length()+1][t.length()+1];
		 
		 for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(s.charAt(i-1) ==  t.charAt(j-1)) {
					dp[i][j]=  1 + dp[i-1][j-1];
				}
				else {
					int skipS = dp[i-1][j];
					int skipT = dp[i][j-1];
					dp[i][j]=  Math.max(skipS, skipT);
				}
				
			}
		}
		 
		 return dp[dp.length-1][dp[0].length-1];
		 
	}

}