package 二叉树;

public class MyTreeUtils {

    // Prints post order by preOrder and midOrder.
    public static String generatePostOrder(String preOrder, String midOrder) {
        if (preOrder == null || preOrder.equals("")) {
            return "";
        }
        char rootValue = preOrder.charAt(0);
        int rootIndex = midOrder.indexOf(rootValue);

        return generatePostOrder(preOrder.substring(1, 1 + rootIndex), midOrder.substring(0, rootIndex))
                + generatePostOrder(preOrder.substring(1 + rootIndex), midOrder.substring(1 + rootIndex)) + rootValue;
    }

    // Searchs node whose value is @value in @root binary tree.
    public static MyNode search(MyNode root, char value) {
        MyNode node;

        if (root == null) {
            return null;
        } else {
            if (root.getValue() == value) {
                return root;
            } else {
                node = search(root.getLeft(), value);

                if (node != null) {
                    return node;
                } else {
                    return search(root.getRight(), value);
                }
            }
        }
    }

    // Calculates the numbers of node in @root binary tree
    public static int calNodeCount(MyNode root) {
        if (root != null) {
            return calNodeCount(root.getLeft()) + calNodeCount(root.getRight()) + 1;
        }

        return 0;
    }

    // Determines whether the two binary tree is equal
    // if equal return 1
    // if no equal return 0
    public static int isEqual(MyNode root0, MyNode root1) {
        int result = 0;

        if (root0 == null && root1 == null) {
            return 1;
        } else {
            if (root0 != null && root1 != null) {
                if (root0.getValue() == root1.getValue()) {
                    if (isEqual(root0.getLeft(), root0.getLeft()) == 1) {
                        result = isEqual(root0.getRight(), root1.getRight());
                    }
                }
            }
        }

        return result;
    }

    // Calculates the max height of the @root binary tree
    public static int maxDepth(MyNode root) {
        int totalHeight, leftHeight, rightHeight;

        if (root == null) {
            totalHeight = 0;
        } else {
            leftHeight = maxDepth(root.getLeft());
            rightHeight = maxDepth(root.getRight());

            if (leftHeight >= rightHeight) {
                totalHeight = leftHeight + 1;
            } else {
                totalHeight = rightHeight + 1;
            }
        }

        return totalHeight;
    }

    // Calculates the min depth of @root binary tree
    public static int minDepth(MyNode root) {
        int totalHeight, leftHeight, rightHeight;

        if (root == null) {
            return 0;
        } else {
            leftHeight = minDepth(root.getLeft());
            rightHeight = minDepth(root.getRight());

            if (leftHeight >= rightHeight) {
                totalHeight = rightHeight + 1;
            } else {
                totalHeight = leftHeight + 1;
            }
        }

        return totalHeight;
    }
}
