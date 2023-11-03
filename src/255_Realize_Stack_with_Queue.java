import java.util.Queue;
import java.util.LinkedList;
class MyStack {

    Queue<Integer> main = new LinkedList<>();
    Queue<Integer> helper = new LinkedList<>();

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int x) {
        helper.offer(x);
        while(!main.isEmpty()) {
            helper.offer(main.poll());
        }
        Queue<Integer> temp;
        temp = main;
        main = helper;
        helper = temp;
    }
    
    public int pop() {
        return main.poll();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}
