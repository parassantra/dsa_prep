package stq;

public class QueueUsingArray {
    private int capacity;
    private int[] arr;
    private int currSize = 0;
    int start = -1;
    int end = -1;


    public QueueUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }


    public void push(int num){
        if(currSize == capacity){
            System.out.println("queue full");
            return;
        }
        end = (end + 1) % capacity;
        arr[end] = num;
        if(currSize == 0){
            start = (start + 1) % capacity;
        }
        currSize++;
    }

    public int pop(){
        int item = -1;
        if(currSize == 0){
            System.out.println("queue empty");
            return item;
        }
        item = arr[start];
        arr[start] = 0;
        if(currSize == 1){
            start = -1;
            end = -1;
        }
        else {
            start = (start + 1) % capacity;
        }
        currSize--;
        return item;
    }

    public int top(){
        if(currSize == 0) return -1;
       return arr[start];
    }

    public int size(){
        return currSize;
    }

    public static void main(String[] args) {
        QueueUsingArray qua = new QueueUsingArray(5);
        qua.push(1);
        qua.push(2);
        qua.push(3);
        qua.push(4);
        qua.push(5);
        qua.push(6);
        System.out.println(qua.pop());
        System.out.println(qua.pop());
        System.out.println(qua.pop());
        System.out.println(qua.pop());
        System.out.println(qua.pop());
        System.out.println(qua.pop());
        System.out.println(qua.top());
        qua.push(1);
        System.out.println(qua.top());
        qua.push(2);
        System.out.println(qua.top());
        qua.push(3);
        System.out.println(qua.top());
        qua.push(4);
        System.out.println(qua.top());
        qua.push(5);
        System.out.println(qua.top());
        System.out.println(qua.pop());
        System.out.println(qua.pop());
        System.out.println(qua.pop());
        qua.push(6);
        System.out.println(qua.top());
        qua.push(7);
        System.out.println(qua.top());
        qua.push(8);
        qua.push(9);
        System.out.println(qua.pop());
        System.out.println(qua.pop());
    }
}
