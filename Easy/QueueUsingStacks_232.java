package akhilshettyym.Leet.Easy;

/*
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 */
import java.util.Stack;

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        if (s1.isEmpty()) {
            return -1;
        }
        return s1.pop();
    }

    public int peek() {
        if (s1.isEmpty()) {
            return -1;
        }
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Peek: " + q.peek());
        System.out.println("Pop: " + q.pop());
        System.out.println("Peek after pop: " + q.peek());
        System.out.println("Empty? " + q.empty());

        q.pop();
        q.pop();
        System.out.println("Empty after removing all: " + q.empty());
    }
}