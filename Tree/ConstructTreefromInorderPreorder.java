import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class ConstructTreefromInorderPreorder{
    static void printLevelOrder(Node root) {
        if (root == null) {
            System.out.print("N ");
            return;
        }

        Queue<Node> qq = new LinkedList<>();
        qq.add(root);
        int nonNull = 1;

        while (!qq.isEmpty() && nonNull > 0) {
            Node curr = qq.poll();

            if (curr == null) {
                System.out.print("N ");
                continue;
            }
            nonNull--;

            System.out.print(curr.data + " ");
            qq.add(curr.left);
            qq.add(curr.right);
            if (curr.left != null)
                nonNull++;
            if (curr.right != null)
                nonNull++;
        }
    }
    static Node buildTreeRec(Map<Integer,Integer> mp,int[] preorder,int[] preIndex,int left,int right){
        if(left>right) return null;
        int rootVal=preorder[preIndex[0]];
        preIndex[0]++;
        Node root=new Node(rootVal);
        int index=mp.get(rootVal);
        root.left=buildTreeRec(mp,preorder,preIndex,left,index-1);
        root.right=buildTreeRec(mp,preorder,preIndex,index+1,right);
        return root;
    }
    public static Node buildTree(int inorder[], int preorder[]){
        Map<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            mp.put(inorder[i],i);
        int[] preIndex={0};
        return buildTreeRec(mp,preorder,preIndex,0,inorder.length-1);
    }
    public static void main(String[] args) {
        int[] inorder = {3, 1, 4, 0, 5, 2};
        int[] preorder = {0, 1, 3, 4, 2, 5};
        Node root = buildTree(inorder, preorder);

        printLevelOrder(root);
    }
}