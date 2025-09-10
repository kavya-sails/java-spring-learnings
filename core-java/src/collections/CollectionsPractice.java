package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectionsPractice {
    public static void main(String[] args) {
//        usageOfQueue();
        usageOfStack();
    }

    private static void usageOfQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println("Queue "+queue);
        System.out.println("Queue peek "+queue.peek());
        System.out.println("Queue poll "+queue.poll());
    }

    static void usageOfStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack "+stack);
        System.out.println("Stack peek "+stack.peek());
        System.out.println("Stack pop "+stack.pop());
    }

}
