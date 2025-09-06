class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class FindlengthofLoop{
    public int lengthOfLoop(Node head){
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return countLoopLength(slow);
        }
        return 0;
    }
    private int countLoopLength(Node node){
        Node temp=node.next;
        int count=1;
        while(temp!=node){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=head.next;
        FindlengthofLoop obj=new FindlengthofLoop();
        System.out.println("Length of Loop: "+obj.lengthOfLoop(head));
    }
}