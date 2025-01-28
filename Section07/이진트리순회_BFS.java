package 인프런.Section07;

import java.util.LinkedList;
import java.util.Queue;

class NodeBFS {
    int data;
    NodeBFS lt, rt;
    public NodeBFS(int val) {
        data = val;
        lt=rt=null;
    }
}

public class 이진트리순회_BFS {
    NodeBFS root;

    public void BFS(NodeBFS root) {
        Queue<NodeBFS> q = new LinkedList<>();
        q.offer(root);
        int L = 0; //레벨
        while(!q.isEmpty()) {
            int len = q.size();
            System.out.print(L + " : ");
            for(int i = 0; i < len; i++) {
                NodeBFS cur = q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) q.offer(cur.lt);
                if(cur.rt != null) q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        이진트리순회_BFS tree = new 이진트리순회_BFS();

        tree.root = new NodeBFS(1);
        tree.root.lt = new NodeBFS(2);
        tree.root.rt = new NodeBFS(3);
        tree.root.lt.lt = new NodeBFS(4);
        tree.root.lt.rt = new NodeBFS(5);
        tree.root.rt.lt = new NodeBFS(6);
        tree.root.rt.rt = new NodeBFS(7);

        tree.BFS(tree.root);

    }
}
