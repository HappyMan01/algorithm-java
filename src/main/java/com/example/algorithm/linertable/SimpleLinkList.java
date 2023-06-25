package com.example.algorithm.linertable;

public class SimpleLinkList {
    private Node node;

    // 插入
    public boolean insert(int value) {
        if (this.node == null) {
            this.node = new Node(value);
            return true;
        }
        Node localNode = this.node;
        while (localNode.getNext() != null) {
            localNode = localNode.getNext();
        }
        localNode.setNext(new Node(value));
        return true;
    }

    // 遍历
    public void traverse() {
        if (this.node == null) {
            return;
        }
        Node localNode = this.node;
        while (localNode.getNext() != null) {
            System.out.println(localNode);
            localNode = localNode.getNext();
        }
    }

    @Override
    public String toString() {
        return "SimpleLinkList{" +
                "node=" + node +
                '}';
    }
}
