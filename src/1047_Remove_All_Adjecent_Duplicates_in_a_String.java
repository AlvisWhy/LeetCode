import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        char[] sArray = s.toCharArray();
        Stack<Character> myStack = new Stack<>();
        for (char k: sArray) {
            if(!myStack.empty() && myStack.peek()==k) {
                myStack.pop();
            }
            else{
                myStack.push(k);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!myStack.empty()) {
            sb.insert(0, myStack.pop());
        }
        return sb.toString();
    }
}
