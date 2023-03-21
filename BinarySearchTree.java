public class BinarySearchTree {

    private BinaryTreeNode root;


    public BinarySearchTree(BinaryTreeNode root) {
        this.root = root;
    }


    // return the root of the tree
    public BinaryTreeNode getRoot() {
        return root;
    }
    // add new element to the tree
    public void add(BinaryTreeNode node) {
        addelement(root, node);
    }
    // delete element from the tree.
    public void delete(BinaryTreeNode toDelete) {
        removeElement(root, toDelete);
    }

    // make sure that the new element goes to thr right place
    public void addelement(BinaryTreeNode root, BinaryTreeNode toAdd) {
        if (toAdd.getElement() > root.getElement()) {
            if (root.getRightChild() == null) {
                root.setRight(toAdd);
            } else {
                addelement(root.getRightChild(), toAdd);
            }
        } else if (toAdd.getElement() < root.getElement()) {
            if (root.getLeftChild() == null) {
                root.setLeft(toAdd);
            } else {
                addelement(root.getLeftChild(), toAdd);
            }


        }
    }
    // checks fo the deleting element if it has children and deal with it .
    public BinaryTreeNode removeElement(BinaryTreeNode root, BinaryTreeNode toDelete) {
        if (root == null) return root;
        if (toDelete.getElement() > root.getElement()) {
            root.setRight(removeElement(root.getRightChild(), toDelete));
        } else if (toDelete.getElement() < root.getElement()) {
            root.setLeft(removeElement(root.getLeftChild(), toDelete));

        } else {
            if (root.getLeftChild() == null && root.getRightChild() == null) {
                root = null;
            } else if (root.getRightChild() != null) {
                root.setElement(successor(root));
                root.setRight(removeElement(root.getRightChild(), root));
            } else {
                root.setElement(predecessor(root));
                root.setLeft(removeElement(root.getLeftChild(), root));

            }
        }

        return root;
    }

    private int predecessor(BinaryTreeNode root) {
        root = root.getLeftChild();
        while (root.getRightChild() != null) {
            root = root.getRightChild();
        }
        return root.getElement();
    }

    private int successor(BinaryTreeNode root) {
        root = root.getRightChild();
        while (root.getLeftChild() != null) {
            root = root.getLeftChild();
        }
        return root.getElement();

    }
    // return the height of the tree.
    public int findHeight(BinaryTreeNode node) {
        if (node == null) {
            return -1;
        }

        int heightLeft = findHeight(node.getLeftChild());
        int heightRight = findHeight(node.getRightChild());
        if (heightLeft > heightRight) {
            return heightLeft + 1;
        } else {
            return heightRight + 1;
        }

    }
    // checks if the tree is balanced
    public boolean isBelanced() {
        if (root == null) {
            return true;
        } else {
            int left = 0;
            int right = 0;

            right = findHeight(root.getRightChild());
            left = findHeight(root.getLeftChild());
            if (left - right > 1 || right - left > 1) {
                return false;
            } else {
                return true;
            }


        }
    }

    public void balance() {
        root = balance(root);
    }
    private static final int allowed=1;
    //balance the tree with allowances of 1 different in the height.
    private BinaryTreeNode balance(BinaryTreeNode node) {
        if (node==null){
            return node;
        }
        if (findHeight(node.getLeftChild()) -findHeight(node.getRightChild()) > allowed) {
            if (findHeight(node.getLeftChild().getLeftChild())>=findHeight(node.getLeftChild().getRightChild())){
                node=rotateWithleftChild(node);
            }else {
                node=doubleWithleftChild(node);
            }

        } else if (findHeight(node.getRightChild()) - findHeight(node.getLeftChild())>allowed) {
            if (findHeight(node.getRightChild().getRightChild()) >= findHeight(node.getRightChild().getLeftChild())) {
                node = rotateWithRightChild(node);
            } else {
               node= doubleWithRightChild(node);
            }
        }
      //findHeight(node)=Math.max(findHeight(node.getLeftChild()),findHeight(node.getRightChild()))+1;


        return node;


    }




    private BinaryTreeNode doubleWithRightChild(BinaryTreeNode k3) {
        k3.setRight(rotateWithleftChild(k3.getRightChild()));
        return rotateWithRightChild(k3);
    }

    private BinaryTreeNode doubleWithleftChild(BinaryTreeNode k3) {
        k3.setLeft(rotateWithRightChild(k3.getLeftChild()));
        return rotateWithleftChild(k3);

    }


    static BinaryTreeNode rotateWithRightChild(BinaryTreeNode k2) {
        BinaryTreeNode k1=k2.getRightChild();
        k2.setRight(k1.getLeftChild());
        k1.setLeft(k2);

        return k1;

    }

    static BinaryTreeNode rotateWithleftChild(BinaryTreeNode k2) {
        BinaryTreeNode k1=k2.getLeftChild();
        k2.setLeft(k1.getRightChild());
        k1.setRight(k2);
        return k1;
    }


}

