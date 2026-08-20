class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1 = nums1.length;
        int s2 = nums2.length;
        int total = s1 + s2;

        int i = 0, j = 0;
        int prev = 0;
        int curr = 0;

        for(int k = 0; k <= total / 2; k++) {
            prev = curr;
            if (i < s1 && (j >= s2 || nums1[i] <= nums2[j])) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }
        }

        if (total % 2 == 1) {
            return curr;
        }

        return (prev + curr) / 2.0;
    }
}
