class Solution {

    int f(int prev, int curr, int[] nums, int[][] dp) {

        
        if (curr == nums.length) {
            return 0;
        }

        
        if (dp[prev + 1][curr] != -1) {
            return dp[prev + 1][curr];
        }

        
        int take = 0;

        if (prev == -1 || nums[prev] < nums[curr]) {

            take = 1 + f(curr, curr + 1, nums, dp);
        }

        
        int skip = f(prev, curr + 1, nums, dp);

        
        return dp[prev + 1][curr] = Math.max(take, skip);
    }

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

       
        return f(-1, 0, nums, dp);
    }
}