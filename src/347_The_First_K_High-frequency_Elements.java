import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i: nums) {
            if (!myMap.containsKey(i)) {
                myMap.put(i, 1);
            }
            else {
                myMap.replace(i, myMap.get(i) + 1);
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((i,j)->j[1]-i[1]);
        for (Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
            pq.add(new int[]{entry.getKey(), entry.getValue()});
        }
        int[] res = new int[k];
        for(int i=0 ;i<k; i++) {
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
