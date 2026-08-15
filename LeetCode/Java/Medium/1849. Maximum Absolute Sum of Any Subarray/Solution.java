class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = nums[i] + maxSum;
            maxSum = Math.max(v1,v2);

            int v3 = nums[i];
            int v4 = nums[i] + minSum;
            minSum = Math.min(v3,v4);

            answer = Math.max(answer, Math.max(Math.abs(maxSum), Math.abs(minSum)));
        }
        return answer;
    }
}