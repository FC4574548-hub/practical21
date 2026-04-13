class BinaryTreeNode<E> {
    E value;
    BinaryTreeNode<E> left;
    BinaryTreeNode<E> right;
    
    public BinaryTreeNode(){
        this.value = null;
        this.left = null;
        this.right = null;
    }
    
    public BinaryTreeNode(E value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    //Getter Methods
    public E getValue(){
        return value;

    }

    public BinaryTreeNode<E> getLeft() {
        return left;
    }

    public BinaryTreeNode<E> getRight() {
        return right;
    }
}
