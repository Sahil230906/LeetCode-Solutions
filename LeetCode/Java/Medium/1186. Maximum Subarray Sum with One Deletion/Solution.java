class Solution {
    public int maximumSum(int[] arr) {

        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE / 2;
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int newNoDelete = Math.max(
                arr[i],
                noDelete + arr[i]
            );

            int newOneDelete = Math.max(
                noDelete,
                oneDelete + arr[i]
            );

            noDelete = newNoDelete;
            oneDelete = newOneDelete;

            answer = Math.max(
                answer,
                Math.max(noDelete, oneDelete)
            );
        }

        return answer;
    }
}