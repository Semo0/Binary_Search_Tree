public class main {

    public static void main(String[] args) {
        // please notice that we cannot use the same node in several trees.



        // test one
        BinaryTreeNode<Integer> a= new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> b= new BinaryTreeNode<>(11);
        BinaryTreeNode<Integer> c= new BinaryTreeNode<>(21);
        BinaryTreeNode<Integer> d= new BinaryTreeNode<>(33);
        BinaryTreeNode<Integer> e= new BinaryTreeNode<>(48);
        BinaryTreeNode<Integer> f= new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> g= new BinaryTreeNode<>(6);

//        BinarySearchTree tree1=new BinarySearchTree(a);
//        tree1.add(b);
//        tree1.add(c);
//        tree1.add(d);
//        tree1.add(e);
//
//        BinaryTreePrint print1=new BinaryTreePrint(tree1.getRoot());
//
//
//        print1.printTree(tree1.getRoot());
//        System.out.println("\n");
//        System.out.println(tree1.isBelanced());


        //test 2

        BinarySearchTree tree=new BinarySearchTree(e);
        tree.add(a);
        tree.add(b);
        tree.add(d);
        tree.add(f);

        BinaryTreePrint print2=new BinaryTreePrint(tree.getRoot());


        print2.printTree(tree.getRoot());
        System.out.println("\n");
        System.out.println(tree.isBelanced());

        //test 3
        BinaryTreeNode<Integer> aa= new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> bb= new BinaryTreeNode<>(11);
        BinaryTreeNode<Integer> cc= new BinaryTreeNode<>(21);
        BinaryTreeNode<Integer> dd= new BinaryTreeNode<>(33);
        BinaryTreeNode<Integer> ee= new BinaryTreeNode<>(48);
        BinaryTreeNode<Integer> ff= new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> gg= new BinaryTreeNode<>(6);

        BinarySearchTree tree3=new BinarySearchTree(dd);
        tree3.add(cc);
        tree3.add(ee);
        tree3.add(ff);
        tree3.add(gg);
        tree3.add(bb);

        BinaryTreePrint print3=new BinaryTreePrint(tree3.getRoot());


        print3.printTree(tree3.getRoot());
        System.out.println("\n");
        System.out.println("is the tee balanced?"+tree3.isBelanced()+"\n");

        tree3.balance();
        print3.printTree(tree3.getRoot());
        System.out.println("\n");
        System.out.println("is the tee balanced?"+tree3.isBelanced()+"\n");


    }
}
