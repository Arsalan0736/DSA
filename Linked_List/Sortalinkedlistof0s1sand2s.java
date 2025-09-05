class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Sortalinkedlistof0s1sand2s{
    public Node segregate(Node head){
        if(head==null||head.next==null) return head;
        Node zeroDummy=new Node(0);
        Node oneDummy=new Node(0);
        Node twoDummy=new Node(0);
        Node zero=zeroDummy,one=oneDummy,two=twoDummy;
        Node curr=head;
        while(curr!=null){
            if(curr.data==0){
                zero.next=curr;
                zero=zero.next;
            }
            else if(curr.data==1){
                one.next=curr;
                one=one.next;
            }
            else{
                two.next=curr;
                two=two.next;
            }
            curr=curr.next;
        }
        zero.next=(oneDummy.next!=null)?oneDummy.next:twoDummy.next;
        one.next=twoDummy.next;
        two.next=null;
        return zeroDummy.next;
    }
    public static void main(String[] args) {
        Sortalinkedlistof0s1sand2s list=new Sortalinkedlistof0s1sand2s();
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(0);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(0);
        head= list.segregate(head);
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}