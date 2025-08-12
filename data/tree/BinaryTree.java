package com.data.tree;

import java.util.LinkedList;
import java.util.Queue;

// Node class
    class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    // * level order traversal of the binary tree
    public void levelOrder(Node root) {
        // Initialize a queue to store nodes at each level
        Queue<Node> queue = new LinkedList<>();

        // Add the root node to the queue
        queue.add(root);

        // Loop until the queue is empty
        while (!queue.isEmpty()) {
            Node node = queue.poll();

            // Print the value of the current node
            System.out.print(node.value + " ");

            // Add the left child of the current node to the queue
            if (node.left != null) {
                queue.add(node.left);
            }

            // Add the right child of the current node to the queue
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    // Insert a new node into the binary tree
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insertNode(root, value);
        }
    }

    // Helper method to insert a new node into the binary tree
    private void insertNode(Node node, int value) {
        if (value < node.value) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                insertNode(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                insertNode(node.right, value);
            }
        }
    }

    // Pre-order traversal
    public void preorder() {
        preorderNode(root);
    }

    // Helper method for pre-order traversal
    private void preorderNode(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderNode(node.left);
            preorderNode(node.right);
        }
    }

    // In-order traversal
    public void inorder() {
        inorderNode(root);
    }

    // Helper method for in-order traversal
    private void inorderNode(Node node) {
        if (node != null) {
            inorderNode(node.left);
            System.out.print(node.value + " ");
            inorderNode(node.right);
        }
    }

    // Post-order traversal
    public void postorder() {
        postorderNode(root);
    }

    // Helper method for post-order traversal
    private void postorderNode(Node node) {
        if (node != null) {
            postorderNode(node.left);
            postorderNode(node.right);
            System.out.print(node.value + " ");
        }
    }


}
