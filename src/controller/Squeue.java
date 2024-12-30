package controller;
import model.Node;
public class Squeue {
    private Node front; //con trỏ đầu hàng đợi
    private Node rear;  // con trỏ cuối hàng đợi

    public void enQueue(int data){
        Node newNode = new Node(data);
        if (front == null){
            front = newNode;
            rear = newNode;
        } else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int deSqueue(){
        if(front == null){
            System.out.println("Squeue is empty!!!");
            return -1;
        }
        Node delNode = front;
        front = front.next;
        if (front == null){
            rear = null;
        }
        return delNode.data;

    }
}
