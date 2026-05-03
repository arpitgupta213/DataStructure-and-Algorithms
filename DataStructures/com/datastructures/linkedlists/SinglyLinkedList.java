package com.datastructures.linkedlists;

import java.util.Arrays;

public class SinglyLinkedList {
    private SinglyNode head;
    private SinglyNode tail;
    private int length;

    public SinglyLinkedList(int value) {
        head = new SinglyNode(value);
        tail = head;
        length = 1;
    }

    public void append(int value) {
        SinglyNode newNode = new SinglyNode(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        SinglyNode newNode = new SinglyNode(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public int getLength() {
        return length;
    }

    public int[] printList() {
        int[] myList = new int[length];
        SinglyNode current = this.head;
        int i = 0;
        while (current != null) {
            myList[i] = current.value;
            current = current.next;
            i++;
        }
        return myList;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > length) {
            System.err.println("Index Out Of Bounds For Length " + length);
        } else if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            SinglyNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            SinglyNode newNode = new SinglyNode(value);
            newNode.next = current.next;
            current.next = newNode;
            length++;
        }
    }

    public void remove(int index) {
        if (index < 0 || index > length) {
            System.err.println("Index Out Of Bounds For Length " + length);
        } else if (index == 0) {
            head = this.head.next;
            length--;
        } else {
            SinglyNode current = head;
            int i;
            for (i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            length--;
            if (i == length - 1) {
                tail = current;
            }
        }
    }

    //Aproach1
    //Space complexity -> O(n) as we are creating a new linkedlist here
    public SinglyLinkedList reverse(SinglyLinkedList linkedList) {
        SinglyLinkedList newList = new SinglyLinkedList(linkedList.head.value);
        SinglyNode current = linkedList.head;
        while (current.next != null) {
            current = current.next;
            SinglyNode newNode = new SinglyNode(current.value);
            newNode.next = newList.head;
            newList.head = newNode;
            newList.length++;
        }
        return newList;
    }


    public static void main(String[] args) {
        SinglyLinkedList myLinkedList = new SinglyLinkedList(10);
        //append
        myLinkedList.append(12);
        myLinkedList.append(16);
        //prepend
        myLinkedList.prepend(20);
        myLinkedList.prepend(50);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        //insert
        myLinkedList.insert(2, 25);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        //remove
        myLinkedList.remove(4);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        //reverse
        SinglyLinkedList linkedList2 = myLinkedList.reverse(myLinkedList);
        System.out.println("reverse linkedList" + Arrays.toString(linkedList2.printList()));
    }
}
