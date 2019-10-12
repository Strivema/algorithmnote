package com.exampale.algorithm;

import java.util.Stack;

/**
 * 最小栈
 *
 * @author Ray.Ma
 * @date 2019/10/12 15:33
 */
public class MinStack {

    private Stack<Integer> stack;

    private Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty() || minStack.peek() >= x)
            minStack.push(x);
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek()))
            minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
