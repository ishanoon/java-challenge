package com.company;

public class Solution {
    public int countNodesInTree (Node node) {
        if(node == null){
            return 0;
        }else if(node.getRight() == null ) {
            return countNodesInTree(node.getLeft()) + 1;
        }else if(node.getLeft() == null){
            return countNodesInTree(node.getRight()) + 1;
        }
        return countNodesInTree(node.getLeft()) + countNodesInTree(node.getRight()) + 1;
    }

    static class Node {
        private Node left;
        private Node right;
        private int value;

        Node (int value) {
            this.value = value;
        }


        void setLeft(Node left) {
            this.left = left;
        }

        void setRight(Node right) {
            this.right = right;
        }

        Node getLeft() {
            return left;
        }

        Node getRight() {
            return right;
        }

        int value() {
            return value;
        }
    }
}
