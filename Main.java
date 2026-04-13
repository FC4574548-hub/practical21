public class Main {
  public static void main(String[] args){

    BinaryTreeNode<Character> a = new BinaryTreeNode<>("a");
    BinaryTreeNode<Character> b = new BinaryTreeNode<>("b");
    BinaryTreeNode<Character> c = new BinaryTreeNode<>("c");
    BinaryTreeNode<Character> d = new BinaryTreeNode<>("d");
    BinaryTreeNode<Character> e = new BinaryTreeNode<>("e");

    a.setLeft(b);
    a.setLeft(c);
    b.setLeft(d);
    b.setLeft(e);

    BinaryTree<Character> bt1 = new BinaryTree<>();
    bt1.setRoot(a);
    bt1.setSize(5);
  }
}
