class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class RotateaLinkedList{
    public Node rotate(Node head, int k){
        if(k==0||head==null) return head;
        Node curr = head;
        int len=1;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        k%=len;
        if(k==0) return head;
        curr.next=head;
        curr=head;
        for(int i=1;i<k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
    static void printList(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        RotateaLinkedList list = new RotateaLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        System.out.println("Original List:");
        printList(head);
        
        int k = 2;
        head = list.rotate(head, k);
        
        System.out.println("Rotated List by " + k + " positions:");
        printList(head);
    }
}