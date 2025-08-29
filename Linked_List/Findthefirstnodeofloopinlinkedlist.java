class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class Findthefirstnodeofloopinlinkedlist{
    public int cycleStart(Node head){
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow.data;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;
        Findthefirstnodeofloopinlinkedlist obj=new Findthefirstnodeofloopinlinkedlist();
        System.out.println(obj.cycleStart(head));
    }
}
