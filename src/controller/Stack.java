package controller;

import model.Node;

public class Stack {
    private Node top;
    private int length;
    public Stack(){
        this.top = null;
        this.length = 0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
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
        if(isEmpty()){
            System.out.println("Stack trong!!");
            return Integer.MIN_VALUE;
        }
        Node temp = top;
        top = top.next;
        return temp.data;
    }
}
