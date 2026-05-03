package com.datastructures.stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
public class ArrayStack {
    private List<Integer> array = new ArrayList<>();

    public ArrayStack() {
    }

    public int peak() {
        if(array.size() == 0) {
            throw new EmptyStackException();
        }
        return array.get(this.array.size() - 1);
    }

    public int pop() {
        if(array.size() == 0) {
            throw new EmptyStackException();
        }
        return array.remove(array.size() - 1);
    }

    public void push(int valueToPush) {
        array.add(valueToPush);
    }

    public void printStack() {
        System.out.println("--STACK START--");
        for (int value : array) {
            System.out.println(value);
        }
        System.out.println("--STACK END--");
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.printStack();
        stack.push(3);
        stack.printStack();
        stack.pop(); // Removed 3
        stack.printStack();
    }
}
