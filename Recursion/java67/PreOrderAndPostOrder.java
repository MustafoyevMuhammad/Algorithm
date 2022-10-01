package Recursion.java67;

public class PreOrderAndPostOrder {
    TreeNode head;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode("1");
        treeNode.left = new TreeNode("2");
        treeNode.left.left = new TreeNode("3");
        treeNode.left.right = new TreeNode("4");
        treeNode.left.left.left = new TreeNode("k");
        treeNode.left.left.right = new TreeNode("right");
        treeNode.right = new TreeNode("5");
        treeNode.right.left = new TreeNode("6");
//        preOrder(treeNode);
//        System.out.println();
//        postOrder(treeNode);
        TreeNode tree = new TreeNode("45");
        tree.left =new TreeNode("25");
        tree.left.left = new TreeNode("15");
        tree.left.left.left = new TreeNode("5");
        tree.right = new TreeNode("55");
        tree.right.right = new TreeNode("65");
        tree.left.right = new TreeNode("35");
        tree.left.right.left = new TreeNode("77");
        tree.left.right.right = new TreeNode("88");
        postOrder(tree);
    }

    private static void postOrder(TreeNode node){
        if (node == null)
            return;
        if (node.left != null) postOrder(node.left);
        if (node.right != null) postOrder(node.right);
        System.out.printf("%s \t",node.str);
    }

    private static void preOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.printf("%s \t", node.str);
        if (node.left != null) preOrder(node.left);
        if (node.right != null) preOrder(node.right);
    }

    static class TreeNode {
        String str;
        TreeNode left, right;

        public TreeNode(String str) {
            this.str = str;
            left = right = null;
        }

    }
}
