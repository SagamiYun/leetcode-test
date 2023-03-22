package com.sagamiyun.mystudy.easy;

import java.util.Stack;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName MyQueue</p>
 * <p>@Description 我们可以使用一个栈（输入栈）来处理入队操作，另一个栈（输出栈）来处理出队操作。
 * 当执行出队操作时，如果输出栈为空，我们需要将输入栈的所有元素移到输出栈中，以确保队列的先入先出特性。 </p>
 * <p>232. 用栈实现队列</p>
 */
public class MyQueue {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) {
        inputStack.push(x);
    }

    public int pop() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
