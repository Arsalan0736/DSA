class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class DiameterofaBinaryTree{
    static int diameterRec(Node root,int[] res){
        if(root==null) return 0;
        int lHeight=diameterRec(root.left,res);
        int rHeight=diameterRec(root.right,res);
        res[0]=Math.max(res[0],lHeight+rHeight);
        return 1+Math.max(lHeight,rHeight);
    }
    int diameter(Node root){
        int[] res=new int[1];
        diameterRec(root,res);
        return res[0];
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        DiameterofaBinaryTree tree = new DiameterofaBinaryTree();
        System.out.println("Diameter of the tree is: " + tree.diameter(root));
    }
}