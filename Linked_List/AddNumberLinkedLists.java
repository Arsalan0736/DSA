class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class AddNumberLinkedLists{
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static int countNodes(Node head){
        int len=0;
        Node curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        return len;
    }
    static Node trimLeadingZeros(Node head){
        while(head!=null&&head.data==0){
            head=head.next;
        }
        return head;
    }
    static Node addTwoLists(Node head1, Node head2){
        head1=trimLeadingZeros(head1);
        head2=trimLeadingZeros(head2);
        int len1=countNodes(head1);
        int len2=countNodes(head2);
        if(len1<len2){
            return addTwoLists(head2,head1);
        }
        int carry=0;
        Node num1=reverse(head1);
        Node num2=reverse(head2);
        Node res=num1;
        while(num2!=null||carry!=0){
            num1.data+=carry;
            if(num2!=null){
                num1.data+=num2.data;
                num2=num2.next;
            }
            carry=num1.data/10;
            num1.data=num1.data%10;
            if(num1.next==null&&carry!=0){
                num1.next=new Node(0);
            }
            num1=num1.next;
        }
        return reverse(res);
    }
    public static void main(String[] args) {
        Node head1=new Node(9);
        head1.next=new Node(9);
        head1.next.next=new Node(9);
        head1.next.next.next=new Node(9);
        head1.next.next.next.next=new Node(9);
        head1.next.next.next.next.next=new Node(9);
        head1.next.next.next.next.next.next=new Node(9);
        Node head2=new Node(9);
        head2.next=new Node(9);
        head2.next.next=new Node(9);
        head2.next.next.next=new Node(9);
        head2.next.next.next.next=new Node(9);
        Node res=addTwoLists(head1,head2);
        while(res!=null){
            System.out.print(res.data+" ");
            res=res.next;
        }
    }
}