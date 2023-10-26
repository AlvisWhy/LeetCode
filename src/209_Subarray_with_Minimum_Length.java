class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum = nums[0];
        int res = 0;
        while (j < nums.length || sum>target) {
            if (sum < target) {
                j += 1;
                if (j<nums.length) {
                sum += nums[j];
                }
            }
            else {
                if (res ==0 || j - i + 1 <res){
                    res = j - i + 1;
                }
                sum -= nums[i];
                i += 1;
            }
        }
        return res;
    }
}
