class Solution {


    public int countRatioSubarrays(int[] nums, int a, int b) {
        int count=0;
for (int i = 0; i < nums.length; i++) {
    int even = 0, odd = 0;

    for (int j = i; j < nums.length; j++) {
        if (nums[j] % 2 == 0)
            even++;
        else
            odd++;

        if ((long) even * b <= (long) odd * a)
            count++;
    }
}
        return count;
    }
}