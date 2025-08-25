class Node{
    int data;
    Node next;
    Node (int x){
        data=x;
        next=null;
    }
}
class ReverseaLinkedListingroupsofgivensize{
    public static Node reverseKGroup(Node head, int k){
        if(head==null) return head;
        Node curr=head;
        Node newHead=null;
        Node tail=null;
        while(curr!=null){
            Node groupHead=curr;
            Node prev=null;
            Node nextNode=null;
            int count=0;
            while(curr!=null&&count<k){
                nextNode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextNode;
                count++;
            }
            if(newHead==null) newHead=prev;
            if(tail!=null) tail.next=prev;
            tail=groupHead;
        }
        return newHead;
    }
    static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        int k=2;
        System.out.println("Original List:");
        printList(head);
        head=reverseKGroup(head,k);
        System.out.println("Reversed List in groups of size "+k+":");
        printList(head);
    }
}