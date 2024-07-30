package stq;

class SNode{
    int num;
    SNode next;
}

public class StackUsingLL {
   private SNode top;
   int currSize = 0;

   public StackUsingLL(){
       this.top = null;
   }

   public void push (int num){
        SNode newNode = new SNode();
        newNode.num = num;
        newNode.next = top;
        top = newNode;
        currSize++;
   }

    public int pop (){
        int item = -1;
        if (size() == 0) {
            System.out.println("stack empty");
            return -1;
        }
        else{
            item = top.num;
            top = top.next;
            currSize--;
        }
        return item;
    }

    public int top (){
        if (size() == 0) {
            System.out.println("stack empty");
            return -1;
        }
        return top.num;
    }

    public int size(){
       return currSize;
    }

    public static void main(String[] args) {
        StackUsingLL stull = new StackUsingLL();
        System.out.println(stull.top());
        System.out.println(stull.pop());
        stull.push(1);
        stull.push(2);
        stull.push(3);
        System.out.println(stull.top());
        System.out.println(stull.pop());
        System.out.println(stull.top());
        System.out.println(stull.pop());
        System.out.println(stull.top());
        System.out.println(stull.pop());
        System.out.println(stull.top());
        System.out.println(stull.pop());
        stull.push(1);
        System.out.println(stull.top());
        stull.push(2);
        System.out.println(stull.top());
        stull.push(3);
        System.out.println(stull.top());
    }

}
