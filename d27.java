Perfect Squares

class Solution {
    public int numSquares(int n) {
        if(n < 4) return n;
        int[] dp = new int[n + 1];
        for(int i=0;i<4;i++)
            dp[i]=i;
        for(int i = 4; i <= n; i++) {
            int j = 1;
            dp[i] = i;
            while(i - j * j >= 0) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                j++;
            }
        }
        
        return dp[n];
    }
}
