package 二叉树;

public class MyNode {

    private final char value;
    private MyNode left;
    private MyNode right;

    public MyNode(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public MyNode getLeft() {
        return left;
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public MyNode getRight() {
        return right;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public char getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyNode [value=" + value + ", left=" + left + ", right=" + right + "]";
    }
}
