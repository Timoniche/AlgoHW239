package com.algopfml.hw1.bst;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public Node findMinNode() {
        Node minNode = root;
        while (minNode.getLeft() != null) {
            minNode = minNode.getLeft();
        }
        return minNode;
    }

    public Node findMaxNode() {
        Node maxNode = root;
        while (maxNode.getRight() != null) {
            maxNode = maxNode.getRight();
        }
        return maxNode;
    }

    public Node findByValue(int value) {
        //todo:
        throw new UnsupportedOperationException("todo");
    }

    public Node getRoot() {
        return root;
    }

    public static List<Integer> getAllValues(BinarySearchTree bst) {
        List<Integer> values = new ArrayList<>();
        getAllValues(bst.getRoot(), values);
        return values;
    }

    private static void getAllValues(Node node, List<Integer> values) {
        if (node == null) {
            return;
        }
        values.add(node.getValue());
        getAllValues(node.getLeft(), values);
        getAllValues(node.getRight(), values);
    }
}
