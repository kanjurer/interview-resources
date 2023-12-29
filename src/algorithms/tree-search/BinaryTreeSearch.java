import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeSearch {

    /**
     * Inorder: Left Root Right
     *
     * @param root: root node of the tree
     * @param <T>:  type of value stored in the root
     */
    public static <T> void inorderSearch(TreeNode<T> root) {
        if (root == null) return;

        Stack<TreeNode<T>> s = new Stack<>();
        s.push(root);

        TreeNode<T> tmp;
        while (!s.isEmpty()) {
            tmp = s.pop();

            if (tmp.getLeft() != null) s.push(tmp.getLeft());
            if (tmp.getRight() != null) s.push(tmp.getRight());
            System.out.println(tmp);
        }
    }

    public static <T> void breadthFirstSearch(TreeNode<T> root) {
        if (root == null) return;

        Queue<TreeNode<T>> q = new ArrayDeque<>();
        q.add(root);

        TreeNode<T> tmp;
        while (!q.isEmpty()) {
            tmp = q.remove();

            if (tmp.getLeft() != null) q.add(tmp.getLeft());
            if (tmp.getRight() != null) q.add(tmp.getRight());

            System.out.println(tmp);
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.setLeft(new TreeNode<>(2));
        root.setRight(new TreeNode<>(3));

        breadthFirstSearch(root);
        inorderSearch(root);
    }
}