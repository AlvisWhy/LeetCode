class Solution {
    public String dynamicPassword(String password, int target) {
        target = target%password.length();

        char[] str = password.toCharArray();
        reverse(str, 0, str.length-1);
        reverse(str, 0, str.length-target-1);
        reverse(str, str.length-target, str.length-1);

        return(new String(str));
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
