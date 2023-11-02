class Solution {
    public String pathEncryption(String path) {
        StringBuffer str = new StringBuffer(path);
        for(int i=0; i< path.length(); i++) {
            if (str.charAt(i) == '.') {
                str.replace(i,i+1," ");
            }
        }
        return str.toString();
    }
}
