import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class MirrorTree{
    void mirror(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            Node temp=curr.left;
            curr.left=curr.right;
            curr.right=temp;
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }
    void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        MirrorTree tree=new MirrorTree();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("Inorder traversal of original tree:");
        tree.inorder(root);
        tree.mirror(root);
        System.out.println("\nInorder traversal of mirrored tree:");
        tree.inorder(root);
    }
}