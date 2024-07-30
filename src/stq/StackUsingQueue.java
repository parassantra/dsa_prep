package stq;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {

    private Queue q;


    public StackUsingQueue(){
        this.q = new ArrayDeque();
    }


    public void push(int num){
        int len = q.size();
        q.offer(num);
        for(int i=0; i<len; i++){
            q.offer(q.poll());
        }
    }

    public int pop (){
        if(q.size() == 0){
            System.out.println("stack is empty");
            return -1;
        }
        return (int) q.poll();
    }

    public int top (){
        if(q.size() == 0){
            System.out.println("stack is empty");
            return -1;
        }
        return (int) q.peek();
    }

    public int currSize(){
        return q.size();
    }

    public static void main(String[] args) {
        StackUsingQueue stq = new StackUsingQueue();
        stq.push(1);
        stq.push(2);
        stq.push(3);
        stq.push(4);
        stq.push(5);
        System.out.println(stq.pop());
        System.out.println(stq.pop());
        System.out.println(stq.pop());
        System.out.println(stq.pop());
        System.out.println(stq.pop());
        stq.push(1);
        stq.push(2);
        System.out.println(stq.top());

    }
}
