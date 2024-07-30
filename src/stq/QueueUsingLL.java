package stq;

class QNode{
    int num;
    QNode next;
}

public class QueueUsingLL {
   private QNode start = null;
    private QNode end = null;
   int currSize = 0;

   public QueueUsingLL(){
       this.start = null;
       this.end = null;
   }

   public void push (int num){
        QNode newNode = new QNode();
        newNode.num = num;
        if(currSize == 0){
            start = newNode;
            end = newNode;
        }
        else {
            end.next = newNode;
            end = newNode;
        }
        currSize++;
   }

    public int pop (){
        if(currSize == 0){
            System.out.println("queue empty");
            return -1;
        }
        int item = start.num;
        start = start.next;
        if(currSize == 1){
            end = null;
        }
        currSize--;
        return item;
    }

    public int top (){
        if (size() == 0) {
            System.out.println("q empty");
            return -1;
        }
        return start.num;
    }

    public int size(){
       return currSize;
    }

    public static void main(String[] args) {
        QueueUsingLL qua = new QueueUsingLL();
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
