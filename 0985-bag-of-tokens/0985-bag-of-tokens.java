class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        int score=0;
        Arrays.sort(tokens);
        int i=0,j=n-1;
        int maxScore=0;
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                score+=1;
                i+=1;
            }
            else if(score>=1){
                power+=tokens[j];
                score-=1;
                j-=1;
            }
            else{
                return maxScore;
            }
            maxScore=Math.max(maxScore,score);
        }
        return maxScore;
        
    }
}