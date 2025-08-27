class Node{
    int data;
    Node next,random;
    Node(int d){
        data=d;
        next=random=null;
    }
}
class Clonelinkedlistwithnextandrandompointer{
    static Node cloneLinkedList(Node head){
        if(head==null) return null;
        Node curr=head;
        while(curr!=null){
            Node newNode=new Node(curr.data);
            newNode.next=curr.next;
            curr.next=newNode;
            curr=newNode.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
        curr=head;
        Node cloneHead=head.next;
        Node clone=cloneHead;
        while(clone.next!=null){
            curr.next=curr.next.next;
            clone.next=clone.next.next;
            curr=curr.next;
            clone=clone.next;
        }
        curr.next=null;
        clone.next=null;
        return cloneHead;
    }
    static void printList(Node head){
        while(head!=null){
            System.out.print(head.data+"(");
            if(head.random!=null){
                System.out.print(head.random.data);
            }
            else{
                System.out.print("null");
            }
            System.out.print(")");
            if(head.next!=null){
                System.out.print("->");
            }
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        head.next=second;
        second.next=third;
        head.random=third;
        second.random=head;
        third.random=second;
        System.out.println("Original list:");
        printList(head);
        Node cloneHead=cloneLinkedList(head);
        System.out.println("Cloned list:");
        printList(cloneHead);
    }
}