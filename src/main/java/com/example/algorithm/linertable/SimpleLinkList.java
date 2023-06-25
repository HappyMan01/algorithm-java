package com.example.algorithm.linertable;

import ch.qos.logback.classic.pattern.ClassOfCallerConverter;

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

    // 删除
    public void delete(int value) {
        if (this.node == null) {
            if (this.node.getData() == value) {
                this.node = null;
                return;
            }
        }
        Node localNode = null;
        while (localNode.getNext() != null) {
            localNode = localNode.getNext();
        }

    }


    @Override
    public String toString() {
        return "SimpleLinkList{" + "node=" + node + '}';
    }
}
