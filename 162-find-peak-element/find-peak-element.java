class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1] ){
                //peak is in left half
                end = mid;
            }else{
                //peak is in right half
                start = mid + 1;
            }
        }
        return start;  // left == right  --> peak index
    }
}