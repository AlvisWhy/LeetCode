import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();
        char[] myChar = s.toCharArray();
        for (char ss: myChar) {
            if (ss == '(' || ss == '['|| ss == '{'){
                myStack.push(ss);
            }
            else {
                if (myStack.empty()) {
                    return false;
                }
                char newC = myStack.pop();
                if (!(ss==')'&&newC=='(' || ss==']'&&newC=='['||ss=='}'&&newC=='{')) {
                    return false;
                }
            }
        }
        if (myStack.empty()) {
            return true;
        }
        return false;
    }
}
