import java.util.PriorityQueue;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class MergeKsortedlinkedlists{
    Node mergeKLists(Node[] arr){
        if(arr==null||arr.length==0) return null;
        PriorityQueue<Node> qp=new PriorityQueue<>((a,b)->a.data-b.data);
        for(Node node:arr){
            if(node!=null){
                qp.add(node);
            }
        }
        Node dummy=new Node(0);
        Node tail=dummy;
        while(!qp.isEmpty()){
            Node minNode=qp.poll();
            tail.next=minNode;
            tail=tail.next;
            if(minNode.next!=null){
                qp.add(minNode.next);
            }
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        MergeKsortedlinkedlists merger=new MergeKsortedlinkedlists();
        Node[] arr=new Node[3];
        arr[0]=new Node(1);
        arr[0].next=new Node(4);
        arr[0].next.next=new Node(7);
        arr[1]=new Node(2);
        arr[1].next=new Node(5);
        arr[1].next.next=new Node(8);
        arr[2]=new Node(3);
        arr[2].next=new Node(6);
        arr[2].next.next=new Node(9);
        Node mergedHead=merger.mergeKLists(arr);
        while(mergedHead!=null){
            System.out.print(mergedHead.data+" ");
            mergedHead=mergedHead.next;
        }
    }
}