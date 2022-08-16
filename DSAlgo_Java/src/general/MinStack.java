package general;

import java.util.Stack;

public class MinStack {
    Stack<Integer>a,b;

    public MinStack() {
        a=new Stack();
        b=new Stack();
    }
    
    public void push(int val) {
        if(b.empty()||val<=b.peek()){
            b.push(val);
        }
        a.push(val);
        
    }
    
    public void pop() {
        if(!a.empty()){
            if(b.peek().intValue()==a.peek().intValue()){
            b.pop();
        }
         a.pop();
        }
        
    }
    
    public int top() {
        return a.peek();
        
    }
    
    public int getMin() {
        return b.peek();
        
    }

}
