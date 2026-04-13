public class Main {
  public static void main(String[] args){

    BinaryTreeNode<Character> a = new BinaryTreeNode<>('a');
    BinaryTreeNode<Character> b = new BinaryTreeNode<>('b');
    BinaryTreeNode<Character> c = new BinaryTreeNode<>('c');
    BinaryTreeNode<Character> d = new BinaryTreeNode<>('d');
    BinaryTreeNode<Character> e = new BinaryTreeNode<>('e');

    a.setLeft(b);
    a.setLeft(c);
    b.setLeft(d);
    b.setLeft(e);

    BinaryTree<Character> bt1 = new BinaryTree<>();
    bt1.setRoot(a);
    bt1.setSize(5);

    BinaryTreeNode<Double> n1 = new BinaryTreeNode<>(3.4);
    BinaryTreeNode<Double> n2 = new BinaryTreeNode<>(-1.5);
    BinaryTreeNode<Double> n3 = new BinaryTreeNode<>(2.9);
    BinaryTreeNode<Double> n4 = new BinaryTreeNode<>(-9.3);

    n1.setLeft(n2);
    n1.setLeft(n3);
    n2.setLeft(n4);

    BinaryTree<Double> bt2 = new BinaryTree<>();
    bt2.setRoot(n1);
    bt2.setSize(4);

    //Test case
    System.out.println("Tree 1 root: " + bt1.getRoot().getValue());
    System.out.println("Tree 2 root: " + bt2.getRoot().getValue());

    
  }
}
