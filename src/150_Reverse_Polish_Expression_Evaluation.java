import java.util.Deque;
import java.util.LinkedList;
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> myStack = new LinkedList<>();
        for (String s: tokens) {
            if (s.equals("+")) {
                int temp = myStack.pop()+ myStack.pop();
                myStack.push(temp);
            }
            else if (s.equals("-")) {
                int temp = -myStack.pop()+ myStack.pop();
                myStack.push(temp);
            }
            else if (s.equals("*")) {
                int temp = myStack.pop()* myStack.pop();
                myStack.push(temp);
            }
            else if (s.equals("/")) {
                int temp1 = myStack.pop();
                int temp = myStack.pop()/temp1;
                myStack.push(temp);
            }
            else {
                myStack.push(Integer.parseInt(s));
            }
        }
        return myStack.pop();
    }
}
