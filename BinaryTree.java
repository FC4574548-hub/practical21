class BinaryTree<E> {
    int size;
    BinaryTreeNode<E> root;

    public BinaryTree(){
        this.size = 0;
        this.root = null;
    }

    public BinaryTree(BinaryTreeNode<E> root){
        this.root = root;
        this.size = 1;
    }

    public int getSize(){
        return size;
    }
    public BinaryTreeNode<E> getRoot(){
        return root;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setRoot(BinaryTreeNode<E> root){
        this.root = root;
    }

    
}
