public class TreeNode<T> {
    private TreeNode<T> left;
    private TreeNode<T> right;
    private T value;

    public TreeNode(TreeNode<T> left, TreeNode<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public TreeNode(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }


    public T getValue() {
        return value;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value + "";
    }
}
