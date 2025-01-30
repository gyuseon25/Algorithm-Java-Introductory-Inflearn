package 인프런.Section07;

import java.util.LinkedList;
import java.util.Queue;

public class 말단노드_최단거리_BFS {
    Node root;

    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();

        int L = 0;
        queue.offer(root);

        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Node tmp = queue.poll();
                if(tmp.lt == null && tmp.rt == null) return L;
                if (tmp.lt != null) {
                    queue.offer(tmp.lt);
                }
                if (tmp.rt != null) {
                    queue.offer(tmp.rt);
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        말단노드_최단거리_BFS tree = new 말단노드_최단거리_BFS();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.print(tree.BFS(tree.root));
    }
}
