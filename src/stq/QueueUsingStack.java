package stq;

import java.util.Stack;

public class QueueUsingStack {
    private Stack st1;
    private Stack st2;

    public QueueUsingStack(){
        st1 = new Stack();
        st2 = new Stack();
    }

    public void push(int num){
        while(st1.size() != 0){
            st2.push(st1.pop());
        }
        st1.push(num);
        while(st2.size() != 0){
            st1.push(st2.pop());
        }
    }

    public int pop(){
        if(st1.size()  == 0){
            System.out.println("Queue empty");
            return -1;
        }
        return (int)st1.pop();
    }

    public int top(){
        if(st1.size()  == 0){
            System.out.println("Queue empty");
            return -1;
        }
        return (int)st1.peek();
    }

    public static void main(String[] args) {
        QueueUsingStack qus = new QueueUsingStack();

        qus.push(1);
        qus.push(2);
        qus.push(3);
        System.out.println(qus.pop());
        System.out.println(qus.top());
        System.out.println(qus.pop());
        System.out.println(qus.pop());
        System.out.println(qus.pop());
        qus.push(4);
        qus.push(5);
        System.out.println(qus.pop());

    }
}
