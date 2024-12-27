/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Node;

/**
 * @author NHIM
 */
public class Linked_List {
    Node head;

    //them node vao vi tri dau tien
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    // them node vao cuoi cung
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // Tim node cuoi cung
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        // temp chinh thuc la node cuoi cung hien tai
        // lay ode cuoi cung hien tai noi voi newNode
        temp.setNext(newNode);
    }

    //them vào 1 vị trí bất kì
    public void add(int data, int index) {
        Node newNode = new Node(data);

        if (index == 1) {
            addFirst(data);
            return;
        } else {
            Node temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node nextNode = temp.getNext();
            temp.setNext(newNode);
            newNode.setNext(nextNode);
        }

    }


    // in ra mau hinh linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // lay node o mot vi tri bat ki
    public int getNodeByIndex(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.getData();
            }
            count++;
            current = current.getNext();
        }
        throw new IndexOutOfBoundsException("Index khong hop le!!!");
    }

    // in ra do dai cua linked list
    public int lengthOfList() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // xoa node o vi tri dau tien
    public int removeFirst() {
        if (head == null) {
            System.out.println("khong co node nao trong linked list");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        head = head.getNext();
        return temp.data;
    }

    // xóa node ở vị trí cuối cùng
    public int removeLast() {
        Node temp = head;
        if (head == null) {
            System.out.println("Khong co node nao trong linked list!!!");
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            head.setNext(null);
            return Integer.MIN_VALUE;
        }

        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node node = temp.next;
        temp.next = null;
        return node.data;
    }

    // xóa node ở vị trí bất kì
    public int removeIndex(int index) {
        if (head == null) {
            System.out.println("khong co node nao trong linked list!!!");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        int count = 0;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        Node node = temp.next;
        temp.next = temp.next.next;
        return node.data;
    }
}
