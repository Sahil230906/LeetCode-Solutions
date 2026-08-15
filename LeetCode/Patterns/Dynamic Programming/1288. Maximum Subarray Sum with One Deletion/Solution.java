class Solution {
    public int maximumSum(int[] arr) {

        int noDelete = arr[0];
        int oneDelete = 0;
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int newNoDelete = Math.max(
                noDelete + arr[i],
                arr[i]
            );

            int newOneDelete = Math.max(
                oneDelete + arr[i],
                noDelete
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