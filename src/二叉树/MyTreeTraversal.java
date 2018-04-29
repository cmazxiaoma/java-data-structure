package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyTreeTraversal {

    public static void preOrder(MyNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getValue() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public static void InOrder(MyNode root) {
        if (root == null) {
            return;
        }

        InOrder(root.getLeft());
        System.out.print(root.getValue() + " ");
        InOrder(root.getRight());
    }

    public static void postOrder(MyNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    public static void levelOrder(MyNode root) {
        List<List<String>> list = new ArrayList<List<String>>();

        Queue<MyNode> queue = new LinkedList<MyNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<String> cell = new ArrayList<String>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                MyNode node = queue.poll();
                cell.add(String.valueOf(node.getValue()));

                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }

            list.add(cell);
        }

        int count = list.size();

        for (int i = 0; i < count; i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public static void preOrder1(MyNode root) {
        MyStack stack = new MyStack(10);
        // 当前处理的子树不为空或者栈不为空则循环
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                System.out.println(root.getValue());
                stack.push(root);
                root = root.getLeft();
            } else {
                root = stack.pop();
                root = root.getRight();
            }
        }
    }

    public static void midOrder1(MyNode root) {
        MyStack stack = new MyStack(10);

        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.getLeft();
            } else {
                root = stack.pop();
                System.out.println(root.getValue());
                root = root.getRight();
            }
        }
    }

    public static void postOrder1(MyNode root) {
        MyStack stack = new MyStack(10);

        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.getLeft();
            } else {
                if () {

                }
            }
        }
    }
}
