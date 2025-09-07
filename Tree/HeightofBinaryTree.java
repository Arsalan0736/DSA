class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class HeightofBinaryTree{
    int height(Node root){
        if(root==null) return -1;
        int lHeight=height(root.left);
        int rHeight=height(root.right);
        return Math.max(lHeight,rHeight)+1;
    }
    public static void main(String[] args) {
        HeightofBinaryTree tree=new HeightofBinaryTree();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("Height of tree is: "+tree.height(root));
    }
}