package com.sagamiyun.mystudy.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName MyStack</p>
 * <p>@Description 这个实现使用两个队列queue1和queue2来模拟栈的行为。
 * 在插入新元素时，将其插入到queue1中；在执行pop和top操作时，
 * 将queue1中的元素转移到queue2，直到只剩下一个元素，然后进行相应的操作。</p>
 * <p>@Date 2023/3/22 15:25</p>
 */
public class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.offer(x);
    }

    public int pop() {
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        int poppedValue = queue1.poll();

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedValue;
    }

    public int top() {
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int topValue = queue1.peek();
        queue2.offer(queue1.poll());

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topValue;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
