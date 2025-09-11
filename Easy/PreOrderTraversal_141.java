package akhilshettyym.Leet.Easy;

/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
Runtime 0ms

LeetCode -
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }
    private void preorderHelper(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        result.add(root.val);
        preorderHelper(root.left, result);
        preorderHelper(root.right, result);
    }
}   */
public class PreOrderTraversal_141 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;

        public static Node builNode(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builNode(nodes);
            newNode.right = builNode(nodes);

            return newNode;
        }
    }

    public static void preOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+ " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.builNode(nodes);
        preOrderTraversal(root);
    }
}
