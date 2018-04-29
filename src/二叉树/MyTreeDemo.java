package 二叉树;

public class MyTreeDemo {

    public static void main(String[] args) {
        // Creates sample tree.
        MyNode root = MyTreeGenerator.normal();
        // MyTreeTraversal.preOrder1(root);
        MyTreeTraversal.midOrder1(root);
        // System.out.println("前序遍历");
        // MyTreeTraversal.preOrder(root);
        // System.out.println("\n中序遍历");
        // MyTreeTraversal.InOrder(root);
        // System.out.println("\n后序遍历");
        // MyTreeTraversal.postOrder(root);
        // System.out.println("\n层次遍历");
        // MyTreeTraversal.levelOrder(root);
        // System.out.println("========================");
        //
        // // Creates sample trees by preOrder Traversal and midOrder Traversal
        // MyNode newRoot = MyTreeGenerator.sample("ABDEGCF", "DBGEACF");
        // System.out.println("前序遍历");
        // MyTreeTraversal.preOrder(newRoot);
        // System.out.println("\n中序遍历");
        // MyTreeTraversal.InOrder(newRoot);
        // System.out.println("\n后序遍历");
        // MyTreeTraversal.postOrder(newRoot);
        // System.out.println("\n层次遍历");
        // MyTreeTraversal.levelOrder(newRoot);
        //
        // // generate post order by preOrder and midOrder
        // System.out.println("========================");
        // String postOrder = MyTreeUtils.generatePostOrder("ABDEGCF",
        // "DBGEACF");
        // System.out.println(postOrder);
        //
        // // Searchs node whose value is "F"
        // System.out.println("========================");
        // MyNode node = MyTreeUtils.search(root, 'E');
        // System.out.println(node);
        //
        // // Calculates the number of nodes in binary tree
        // System.out.println("========================");
        // int count = MyTreeUtils.calNodeCount(root);
        // System.out.println(count);
        //
        // // Determines whether the two binary tree is equal
        // System.out.println("========================");
        // int result = MyTreeUtils.isEqual(root, root);
        // System.out.println(result);
        //
        // // Calculates the max height of the @root binary tree
        // System.out.println("========================");
        // int max = MyTreeUtils.maxDepth(root);
        // System.out.println(max);
        //
        // // Calculates the min depth of @root binary tree
        // System.out.println("========================");
        // int min = MyTreeUtils.minDepth(root);
        // System.out.println(min);
    }
}
