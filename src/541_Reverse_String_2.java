class Solution {
    public String reverseStr(String s, int k) {

        char[] ss = s.toCharArray();
        int temp = ss.length;
        for (int i=0; i< s.length(); i+=2*k) {
            if (temp>=k){
                reverse(ss, i, i+k-1);
            }
            else {
                reverse(ss, i, ss.length-1);
            }
            temp -= 2*k;
        }
        return new String(ss);
    }

    public void reverse(char[]s, int left, int right) {
        while(left<right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
