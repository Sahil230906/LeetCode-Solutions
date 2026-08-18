class Solution {
    public int subarraySum(int[] nums, int k) {
        int runningSum = 0;
        int count = 0;
        HashMap<Integer,Integer> seen = new HashMap<>();
        seen.put(0,1);

        for(int i = 0; i < nums.length; i++) {
            runningSum += nums[i];

            if(seen.containsKey(runningSum - k)) {
                count += seen.get(runningSum - k);
            }

            seen.put(runningSum, seen.getOrDefault(runningSum,0) + 1);
        }
        return count;
    }
}