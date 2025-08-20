class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Mergetwosortedlinkedlists{
    Node sortedMerge(Node head1, Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        if(head1.data<=head2.data){
            head1.next=sortedMerge(head1.next,head2);
            return head1;
        }
        else{
            head2.next=sortedMerge(head1,head2.next);
            return head2;
        }
    }
    static void printList(Node curr){
        while(curr!=null){
            System.out.print(curr.data);
            if(curr.next!=null){
                System.out.print(" ");
            }
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Mergetwosortedlinkedlists list = new Mergetwosortedlinkedlists();
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        
        Node mergedHead = list.sortedMerge(head1, head2);
        printList(mergedHead);
    }
}