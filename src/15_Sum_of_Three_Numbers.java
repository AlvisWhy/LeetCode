import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<3) {
            return res;
        }

        for (int i=0; i< nums.length-2; i++) {
            int j = i+1; 
            int k = nums.length-1;
            if (nums[i]>0) {
                break;
            }
            if (i>0 && (nums[i] == nums[i-1])) {
                continue;
            }
            while(j<k){
                if ((nums[i] + nums[k] + nums[j]) > 0) {
                    k -= 1;
                }
                else if ((nums[i] + nums[k] + nums[j]) < 0) {
                    j += 1;
                }
                else {
                    List<Integer> temp = new ArrayList<>(3);
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    while (j<k && nums[j +1]== nums[j]) {
                        j++;
                    }
                    while (j<k && nums[k -1]== nums[k]) {
                        k--;
                    }
                  // Notice!
                    j++;
                    k--;
                }
            }
        }
        return res;
    }
}
