import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] mergArr = new int[m + n];

        for (int i = 0; i < m; i++) {
            mergArr[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            mergArr[i + m] = nums2[i];
        }

        Arrays.sort(mergArr);

        int len = m + n;

        if (len % 2 == 0) {
            return (mergArr[len / 2 - 1] + mergArr[len / 2]) / 2.0;
        } else {
            return mergArr[len / 2];
        }
    }
}