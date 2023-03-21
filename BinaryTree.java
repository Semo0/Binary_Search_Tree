public class BinaryTree {

    private BinaryTreeNode root;

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public void setRightChildT(BinaryTreeNode root,BinaryTreeNode node){
        if (root!=null){
        root.setRight(node);
        }


    }
    public void setLeftChildT(BinaryTreeNode root,BinaryTreeNode node){
        if (root!=null){
            root.setLeft(node);
        }


    }
}
