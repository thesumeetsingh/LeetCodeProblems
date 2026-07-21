class Solution {

    public int binarySmaller(int key, int left, int right, int arr[]) {

        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                ans = mid;
                right = mid - 1; // continue searching left
            } 
            else if (arr[mid] < key) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public int binaryUpper(int key, int left, int right, int arr[]) {

        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                ans = mid;
                left = mid + 1; // continue searching right
            } 
            else if (arr[mid] < key) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int result[] = new int[2];

        result[0] = binarySmaller(target, 0, nums.length - 1, nums);

        result[1] = binaryUpper(target, 0, nums.length - 1, nums);

        return result;
    }
}