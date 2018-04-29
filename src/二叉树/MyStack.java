package 二叉树;

public class MyStack {
    private int maxSize;
    private MyNode[] stackArray;
    private int top;
    private int[] tags;

    public MyStack(int s) {
        this.maxSize = s;
        this.stackArray = new MyNode[maxSize];
        this.tags = new int[maxSize];
        top = -1;
    }

    public void push(MyNode j) {
        stackArray[++top] = j;
        tags[++top] = 1;
    }

    public MyNode pop() {
        tags[top--] = 0;
        return stackArray[top--];
    }

    public MyNode peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
