class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class DetectLoopinlinkedlist{
    public boolean detectLoop(Node head){
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        DetectLoopinlinkedlist list = new DetectLoopinlinkedlist();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next; // Creating a loop
        System.out.println(list.detectLoop(head)); // Should print true
    }
}