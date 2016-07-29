/**
 * Created by Nazli on 2016-07-20.
 */
import java.io.*;
import java.util.*;
import java.util.LinkedList;


class NodeBFS{
    NodeBFS left,right;
    int data;
    NodeBFS(int data){
        this.data=data;
        left=right=null;
    }
}

class BFSLevelOrder{

    public static void levelOrder(NodeBFS root){

        //Write your code here
        Queue<NodeBFS> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        NodeBFS n;
        while (q != null){
            n = q.remove();
            System.out.print(n.data + " ");

            if (n.left != null){
                q.add(n.left);
            }

            if (n.right != null){
                q.add(n.right);

            }

        }
    }
    public static NodeBFS insert(NodeBFS root,int data){
        if(root==null){
            return new NodeBFS(data);
        }
        else{
            NodeBFS cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        NodeBFS root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
        System.out.println(root);
    }
}

