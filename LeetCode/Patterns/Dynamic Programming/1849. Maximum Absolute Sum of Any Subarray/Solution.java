class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int answer = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = nums[i] + maxSum;
            int v3 = nums[i] + minSum;

            maxSum = Math.max(v1,v2);
            minSum = Math.min(v1,v3);

            answer = Math.max(answer, Math.max(Math.abs(maxSum), Math.abs(minSum)));
        }
        return answer;
    }
}