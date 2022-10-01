package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

class Tree {
    int val;
    Tree left;
    Tree right;

    public Tree(int val) {
        this.val = val;
        right = left = null;
    }
}
class Solution {

    static  int depth = 0;

    public static boolean solve(Tree root) {
        return dfs(0, root);
    }

    public static boolean dfs(int d, Tree root) {
        // base case: null
        if (root == null)
            return true;

        // node is leaf
        if (root.left == null && root.right == null) {
            if (depth == 0)
                depth = d;
            else
                return d == depth;
        }

        // validate left + right
        return dfs(d + 1, root.left) && dfs(d + 1, root.right);
    }

    public static void main(String[] args) {
        Tree node = new Tree(0);
        node.left = new Tree(1);
        node.right = new Tree(3);
        node.left.left = new Tree(2);
        node.right.left = new Tree(4);
        node.right.right = new Tree(5);
        node.right.left.right = new Tree(6);
        node.right.right.left = new Tree(6);
        System.out.print(solve(node));
    }


//    public boolean solve(Tree root) {
//        if (root == null)
//            return true;
//
//        // create a queue for level order traversal
//        Queue<Tree> q = new LinkedList<>();
//        q.add(root);
//
//        int result = Integer.MAX_VALUE;
//        int level = 0;
//
//        // traverse until the queue is empty
//        while (q.size() != 0) {
//            int size = q.size();
//            level++;
//
//            // traverse for complete level
//            while (size > 0) {
//                Tree temp = q.remove();
//
//                // check for left child
//                if (temp.left != null) {
//                    q.add(temp.left);
//
//                    // if its leaf node
//                    if (temp.left.left == null && temp.left.right == null) {
//
//                        // if it's first leaf node, then update result
//                        if (result == Integer.MAX_VALUE)
//                            result = level;
//
//                            // if it's not first leaf node, then compare
//                            // the level with level of previous leaf node.
//                        else if (result != level)
//                            return false;
//                    }
//                }
//
//                // check for right child
//                if (temp.right != null) {
//                    q.add(temp.right);
//
//                    // if its leaf node
//                    if (temp.right.left == null && temp.right.right == null) {
//
//                        // if it's first leaf node, then update result
//                        if (result == Integer.MAX_VALUE)
//                            result = level;
//
//                            // if it's not first leaf node, then compare
//                            // the level with level of previous leaf node.
//                        else if (result != level)
//                            return false;
//                    }
//                }
//                size--;
//            }
//
//        }
//        return true;
//    }
}
