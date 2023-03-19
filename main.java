public class main {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> binaryTreeNode= new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> one= new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> tow= new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> three= new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> four= new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> five= new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> six= new BinaryTreeNode<>(6);

        BinarySearchTree tree=new BinarySearchTree(three);
        tree.add(four);
        tree.add(binaryTreeNode);
        tree.add(five);
        tree.add(six);

        BinaryTreePrint print=new BinaryTreePrint(tree.getRoot());


        print.printTree(tree.getRoot());
        System.out.println("\n");
        System.out.println(tree.isBelanced());
        //tree.balance();
        print.printTree(tree.getRoot());
        System.out.println("\n");
        System.out.println(tree.isBelanced());
        System.out.println("\n");
    }
}
