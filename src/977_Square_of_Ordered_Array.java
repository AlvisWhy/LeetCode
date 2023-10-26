class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0, j=nums.length-1;
        int k =j=nums.length-1;
        int[] newNums = new int[nums.length];
        while(i<=j) {
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];
            if (val1>=val2) {
                newNums[k] = val1;
                i += 1;
            }
            else {
                newNums[k] = val2;
                j -= 1;
            }
            k -= 1;
        }
        return newNums;
    }
}
