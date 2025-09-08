class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class MergeSortforLinkedList{
    public Node mergeSort(Node head){
        if(head==null||head.next==null) return head;
        Node slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow.next;
        slow.next=null;
        Node left=mergeSort(head);
        Node right=mergeSort(mid);
        return merge(left,right);
    }
    private Node merge(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;
        if(a.data<b.data){a.next=merge(a.next,b);return a;}
        else{b.next=merge(a,b.next); return b;}
    }
    public void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        MergeSortforLinkedList list=new MergeSortforLinkedList();
        Node head=new Node(10);
        head.next=new Node(9);
        head.next.next=new Node(8);
        head.next.next.next=new Node(7);
        head=list.mergeSort(head);
        list.printList(head);
    }
}