import java.util.Set;
import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> res = new HashSet<Integer>();
        int sum = 0;
        while(!res.contains(n)){
            res.add(n);
            while(n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
            sum = 0;
        }
        return false;
    }
}
