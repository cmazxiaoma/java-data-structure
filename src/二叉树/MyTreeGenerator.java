package 二叉树;

public class MyTreeGenerator {

    // Creates sample binary tree as normal.
    public static MyNode normal() {
        MyNode root = new MyNode('A');
        root.setLeft(new MyNode('B'));
        root.setRight(new MyNode('C'));
        root.getLeft().setLeft(new MyNode('D'));
        root.getLeft().setRight(new MyNode('E'));
        root.getRight().setRight(new MyNode('F'));
        root.getLeft().getRight().setLeft(new MyNode('G'));

        return root;
    }

    public static MyNode sample(String preOrder, String inOrder) {
        if (preOrder == null || preOrder.equals("")) {
            return null;
        }

        char rootValue = preOrder.charAt(0);
        int rootIndex = inOrder.indexOf(rootValue);

        MyNode root = new MyNode(rootValue);
        root.setLeft(sample(preOrder.substring(1, rootIndex + 1), inOrder.substring(0, rootIndex)));
        root.setRight(sample(preOrder.substring(1 + rootIndex), inOrder.substring(1 + rootIndex)));

        return root;
    }
}
