public class BinaryTreeNode<T> {

    private T element;
    private BinaryTreeNode<T> left, right;


    public BinaryTreeNode(T element) {
        this.element = element;
        left=null;
        right=null;
    }

    public int getElement() {
        return (int) element;
    }

    public BinaryTreeNode getLeftChild() {
        return left;
    }

    public BinaryTreeNode getRightChild() {
        return right;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public void setElement(T element) {
        this.element = element;
    }


}
