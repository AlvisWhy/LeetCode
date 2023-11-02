import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Set<Integer> sum1 = new HashSet<Integer>();
        Map<Integer, Integer> res1 = new HashMap<Integer, Integer>();
        
        int count = 0;
        for (int k: nums1) {
            for (int j: nums2) {
                int add1 = k+j;
                if (!res1.containsKey(add1)) {
                    res1.put(add1,1);
                    sum1.add(add1);
                }
                else {
                    res1.replace(add1, (res1.get(add1) + 1));
                }
            }
        } 
        for (int k: nums3) {
            for (int j: nums4) {
                if (sum1.contains(0-k-j)) {
                    count += res1.get(0-k-j);
                }
            }
        } 
        return count;
    }
}
