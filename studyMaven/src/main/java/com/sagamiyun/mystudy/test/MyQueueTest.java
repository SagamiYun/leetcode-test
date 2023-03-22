package com.sagamiyun.mystudy.test;

import com.sagamiyun.mystudy.easy.MyQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author SagamiYun
 * @version 2023/3/22
 * <p>@ClassName MyQueueTest</p>
 * <p>@Description TODO </p>
 * <p>@Date 2023/3/22 17:30</p>
 */
public class MyQueueTest {
    private MyQueue myQueue;

    @BeforeEach
    void setUp() {
        myQueue = new MyQueue();
    }

    @Test
    void testPushAndEmpty() {
        assertTrue(myQueue.empty());
        myQueue.push(1);
        assertFalse(myQueue.empty());
    }

    @Test
    void testPopAndPeek() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        assertEquals(1, myQueue.peek());
        assertEquals(1, myQueue.pop());
        assertEquals(2, myQueue.peek());
        myQueue.push(4);
        assertEquals(2, myQueue.pop());
        assertEquals(3, myQueue.pop());
        assertEquals(4, myQueue.peek());
    }

    @Test
    void testEmpty() {
        assertTrue(myQueue.empty());
        myQueue.push(1);
        assertFalse(myQueue.empty());
        myQueue.pop();
        assertTrue(myQueue.empty());
    }
}
