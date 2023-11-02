class Solution {
    public String reverseWords(String s) {
        if(s.trim().equals("")) {
            return "";
        }
        
        StringBuffer res = new StringBuffer();
        char[] str = s.toCharArray();
        String temp = "";

        for (int i=0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if (!temp.equals("")) {
                    res.insert(0, temp);
                    res.insert(0, " ");
                }
                temp = "";
            }
            else {
                temp +=s.charAt(i);
            }
        }
        
        if(!temp.equals("")) {
            res.insert(0, temp);
            res.insert(0, " ");
        }
        res.delete(0,1);
        return res.toString();
    }
}
