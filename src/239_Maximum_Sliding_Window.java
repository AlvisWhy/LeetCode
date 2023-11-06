import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> maxQueue = new ArrayDeque<Integer>();
        int[] res = new int[nums.length -k +1];
        for(int i=0; i< k; i++) {
            if(maxQueue.peekFirst() == null) {
                maxQueue.offerLast(nums[i]);
            }
            else {
                while (maxQueue.peekLast() != null && maxQueue.peekLast() < nums[i]) {
                    maxQueue.pollLast();
                }
                maxQueue.offerLast(nums[i]);
            }
        }
        for(int i=0; i< nums.length -k; i++) {
            res[i] = maxQueue.peekFirst();
            if(maxQueue.peekFirst() == nums[i]) {
                maxQueue.pollFirst();
            }
            while(maxQueue.peekLast() != null && maxQueue.peekLast() < nums[i+k]) {
                maxQueue.pollLast();
            }
            maxQueue.offerLast(nums[i+k]);
        }
        res[nums.length -k] = maxQueue.peekFirst();
        return res;
    }
}
