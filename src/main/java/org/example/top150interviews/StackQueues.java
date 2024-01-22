package org.example.top150interviews;

import java.util.ArrayDeque;

public class StackQueues {

//    Implement a last-in-first-out (LIFO) stack using only two queues.
//    The implemented stack should support all the functions of a normal
//    stack (push, top, pop, and empty).
//
//    Implement the MyStack class:
//
//    void push(int x) Pushes element x to the top of the stack.
//    int pop() Removes the element on the top of the stack and returns it.
//    int top() Returns the element on the top of the stack.
//    boolean empty() Returns true if the stack is empty, false otherwise.
//            Notes:
//
//    You must use only standard operations of a queue, which means that only
//    push to back, peek/pop from front, size and is empty operations are valid.
//    Depending on your language, the queue may not be supported natively. You may
//    simulate a queue using a list or deque (double-ended queue) as long as you use
//    only a queue's standard operations.

    private ArrayDeque<Integer> q1;
    private ArrayDeque<Integer> q2;

    public MyStack(){
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push (int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.pollFirst());
        }

        ArrayDeque<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.pollFirst();
    }

    public int top() {
        return q1.peekFirst();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
