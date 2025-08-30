class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class RemoveloopinLinkedList{
    public static void removeLoop(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node slow = head, fast = head;
        slow=slow.next;
        fast=fast.next.next;
        while(fast!=null&&fast.next!=null){
            if(slow==fast) break;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow==fast){
            slow=head;
            if(slow!=fast){
                while(slow.next!=fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
            else{
                fast=fast.next;
            }
            fast.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        removeLoop(head);
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}