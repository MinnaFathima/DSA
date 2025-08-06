class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Increasing slope → peak is to the right
                left = mid + 1;
            } else {
                // Decreasing slope → peak is at mid or to the left
                right = mid;
            }
        }
        // left == right → peak index
        return left;
    }
}
