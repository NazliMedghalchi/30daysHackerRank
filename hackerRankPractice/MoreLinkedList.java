import java.util.Scanner;

/**
 * Created by Nazli on 2016-07-20
 *
 * This challenge is to remove nodes with same data
 * Garbage Collector for C and C++
 * removeDuplicates
 * */

class NodeLinked{
    int data;
    NodeLinked next;
    NodeLinked(int d){
        data=d;
        next=null;
    }

}
class MoreLinkedList {

    public static NodeLinked removeDuplicates(NodeLinked head) {
        //Write your code here
        NodeLinked n = head;
        while (n.next != null){
            NodeLinked temp = n.next;
            if (n.data == temp.data)
                n.next = temp.next;
            else
                n = n.next;
        }
        return head;
    }

    public static  NodeLinked insert(NodeLinked head,int data)
    {
        NodeLinked p=new NodeLinked(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            NodeLinked start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(NodeLinked head)
    {
        NodeLinked start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        NodeLinked head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
