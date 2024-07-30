package stq;

public class StackUsingArray {
    private int capacity;
    private int[] arr;
    private int currSize = 0;
    int top = -1;


    public StackUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
    }


    public void push(int num){
        if(currSize == capacity){
            System.out.println("stack full");
            return;
        }
        else{
            arr[++top] = num;
            currSize++;
        }
    }

    public int pop(){
        int poppedItem = -1;
        if(size() == 0){
            System.out.println("stack empty");
            return poppedItem;
        }
        else{
            poppedItem = arr[top];
            top--;
            currSize--;
        }
        return poppedItem;
    }

    public int top(){
        if(top != -1){
            return arr[top];
        }
        return -1;
    }

    public int size(){
        return currSize;
    }

    public static void main(String[] args) {
        StackUsingArray sua = new StackUsingArray(5);
        sua.push(1);
        sua.push(2);
        sua.push(3);
        sua.push(4);
        sua.push(5);
        sua.push(6);
        System.out.println(sua.pop());
        System.out.println(sua.pop());
        System.out.println(sua.pop());
        System.out.println(sua.pop());
        System.out.println(sua.pop());
        System.out.println(sua.pop());
        System.out.println(sua.top());
        sua.push(1);
        System.out.println(sua.top());
        sua.push(2);
        System.out.println(sua.top());
        sua.push(3);
        System.out.println(sua.top());
        sua.push(4);
        System.out.println(sua.top());
        sua.push(5);
        System.out.println(sua.top());
        sua.push(6);
        System.out.println(sua.top());
    }
}
