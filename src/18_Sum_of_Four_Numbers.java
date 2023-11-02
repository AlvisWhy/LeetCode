import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        
        for (int i=0; i< nums.length -3; i++) {
            if (i>0 && nums[i-1]==nums[i]) {
                continue;
            }
            for (int j=i+1; j< nums.length -2; j++) {
                if (j>i+1 && nums[j-1]==nums[j]) {
                continue;
            }
                int left = j+1;
                int right = nums.length -1;
                while (left < right) {
                  // Notice the case when sum overflow
                    if ((long)nums[i]+ nums[j] + nums[left] + nums[right] < target){
                        left += 1;
                    }
                    else if ((long)nums[i]+ nums[j] + nums[left] + nums[right] > target) {
                        right -= 1;
                    }
                    else {
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right && nums[left+1] == nums[left]) {
                            left ++;
                        }
                        while(left<right && nums[right-1] == nums[right]) {
                            right-- ;
                        }
                        left ++;
                        right --;
                    }
                }
            }
        }
        return res;
    }
}
