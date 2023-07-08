package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;


public class MaxHeight {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        System.out.println(g.sizeOfTree(root1));
        System.out.println(g.sumOfTree(root1));
        System.out.println(g.maxOfTree(root1));
        System.out.println(g.heightOfTree(root1));
    }
}


class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


class Solution {
    public int sizeOfTree(Node root) {
        if (root == null)
            return 0;
        int l = sizeOfTree(root.left);
        int r = sizeOfTree(root.right);
        int rootsize = l + 1 + r;
        return rootsize;
    }

    public int sumOfTree(Node root) {
        if (root == null)
            return 0;
        int r = sumOfTree(root.right);
        int l = sumOfTree(root.left);
        int rt = root.data + r + l;
        return rt;
    }

    public int maxOfTree(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int rmax = maxOfTree(root.right);
        int lmax = maxOfTree(root.left);
        int rtmax = Math.max(root.data, Math.max(rmax, lmax));
        return rtmax;
    }

    public int heightOfTree(Node root) {
        if (root == null)
            return 0;
        int hrst = heightOfTree(root.right);
        int hlst = heightOfTree(root.left);
        int rt = Math.max(hrst, hlst) + 1;
        return rt;
    }
}
