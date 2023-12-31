class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int upIndex = nums.length;
        int downIndex = 0;
        while(upIndex > downIndex) {
            int midIndex = (upIndex + downIndex)/2;
            if (nums[midIndex] < target) {
                downIndex = midIndex+1;
            }
            else if (nums[midIndex] > target) {
                upIndex = midIndex;
            }
            else {
                return midIndex;
            }
        }
        return -1;
    }
}
