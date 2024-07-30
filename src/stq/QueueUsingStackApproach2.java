package stq;

import java.util.Stack;

public class QueueUsingStackApproach2 {
    private Stack st1;
    private Stack st2;

    public QueueUsingStackApproach2(){
        st1 = new Stack();
        st2 = new Stack();
    }

    public void push(int num){
        st1.push(num);
    }

    public int pop(){
       if(!st2.isEmpty()){
           return (int) st2.pop();
       }
       else{
           while(!st1.isEmpty()){
               st2.push(st1.pop());
           }
       }
       if(st2.isEmpty()){
           System.out.println("Queue empty");
           return -1;
       }
        return (int) st2.pop();
    }

    public int top(){
        if(!st2.isEmpty()){
            return (int) st2.peek();
        }
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        if(st2.isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }
        return (int) st2.peek();
    }

    public static void main(String[] args) {
        QueueUsingStackApproach2 qus = new QueueUsingStackApproach2();

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
