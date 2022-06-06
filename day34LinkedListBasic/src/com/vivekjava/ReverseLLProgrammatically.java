package com.vivekjava;

public class ReverseLLProgrammatically {
    Node head;
    private int size;

    ReverseLLProgrammatically() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add first , last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("null");

        System.out.println("Size " + getSize());

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        size--;
        //when only one node is available
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; //head.next = null -> lastNode = null
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public void reverseiterate() {
        if (head == null || head.next == null) {
            //as list is already reversed
            return;
        }

        Node prevNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            //update
            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        ReverseLLProgrammatically list = new ReverseLLProgrammatically();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        list.printList();
        list.reverseiterate();
        list.printList();
    }


}
