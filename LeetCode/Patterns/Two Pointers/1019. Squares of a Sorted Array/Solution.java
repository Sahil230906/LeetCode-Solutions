class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i = 0;
        while(i < n && nums[i] < 0) {
            i++;
        }

        int left = i - 1;
        int right = i;
        int pos = 0;

        while(left >= 0 && right < n) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if(leftsq > rightsq) {
                result[pos] = rightsq;
                right++;
            } else {
                result[pos] = leftsq;
                left--;
            }
            pos++;
        }

        while(left >= 0) {
            result[pos] = nums[left] * nums[left];
            left--;
            pos++;
        }

        while(right < n) {
            result[pos] = nums[right] * nums[right];
            right++;
            pos++;
        }
        return result;
    }
}