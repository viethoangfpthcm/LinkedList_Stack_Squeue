package controller;

import model.Node;

public class Stack {
    private Node top;

    // in stack ra man hinh
    public void printStack(){
        Node temp = top;
        while (temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // them node vao trong stack
    public void push(int data) {
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    // xoa node
    public int pop(){
        if(top == null){
            System.out.println("Stack trong!!");
            return Integer.MIN_VALUE;
        }
        Node temp = top;
        top = top.next;
        return temp.data;
    }
}
