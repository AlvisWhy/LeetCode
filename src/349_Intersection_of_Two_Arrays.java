import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set= new HashSet<Integer>();
        Set<Integer> res = new HashSet<Integer>();

        for (int n: nums1) {
            if (!set.contains(n)) {
                set.add(n);
            }
        }
        for (int n: nums2) {
            if (set.contains(n) && !res.contains(n)) {
                res.add(n);
            }
        }
        int[] rest = new int[res.size()];
        int index = 0;
        for(int i: res) {
            rest[index++] = i;
        }
        return rest;
    }
}
