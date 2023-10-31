class Solution {
    public boolean isAnagram(String s, String t) {

        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        int[] checkList = new int[26];
        for (char cha: char1) {
            checkList[cha - 'a'] += 1;
        }
        for (char cha: char2) {
            checkList[cha - 'a'] -= 1;
        }
        for (int k: checkList) {
            if (k!=0) {return false;}
        }
        return true;
    }
}
