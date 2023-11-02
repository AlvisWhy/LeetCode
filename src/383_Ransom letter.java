import java.util.Map;
import java.util.HashMap;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> sec = new HashMap<>();
        char[] mag = magazine.toCharArray();
        char[] ran = ransomNote.toCharArray();
        for (char c: mag) {
            if (!sec.containsKey(c)) {
                sec.put(c, 1);
            }
            else {
                sec.replace(c, sec.get(c) +1);
            }
        }
        for (char c: ran) {
            if (!sec.containsKey(c) || sec.get(c) == 0){
                return false;
            }
            sec.replace(c, sec.get(c) -1);
        }
        return true;
    }
}
