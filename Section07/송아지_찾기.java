package 인프런.Section07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node8 {
    int data;
    Node8 plus1, minus1, plus5;
    public Node8(int val) {
        data = val;
        plus1 = minus1 = plus5 = null;
    }
}
public class 송아지_찾기 {

    Node8 root;

    public int BFS(Node8 root, int e) {
        Queue<Node8> q = new LinkedList<>();
        ArrayList<Integer> check = new ArrayList<>();
        q.offer(root);
        check.add(root.data);
        int level = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len; i++) {
                Node8 cur = q.poll();
                if(cur.data == e) return level;
                if(!check.contains(cur.data+1)) {
                    q.offer(new Node8(cur.data+1));
                    check.add(cur.data+1);
                }
                if(!check.contains(cur.data+5)) {
                    q.offer(new Node8(cur.data+5));
                    check.add(cur.data+5);
                }
                if(!check.contains(cur.data-1)) {
                    q.offer(new Node8(cur.data-1));
                    check.add(cur.data-1);
                }
            }
            level++;
        }

        return level;
    }

    public static void main(String[] args) {
        송아지_찾기 tree = new 송아지_찾기();

        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int e = scanner.nextInt();

        tree.root = new Node8(s);

        System.out.print(tree.BFS(tree.root, e));

    }
}
