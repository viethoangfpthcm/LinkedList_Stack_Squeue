package view;
import controller.Squeue;
public class Squeue_Main {
    public static void main(String[] args) {
        Squeue sq = new Squeue();

        sq.enQueue(10);
        sq.enQueue(20);
        sq.enQueue(30);
        sq.enQueue(32);
        sq.enQueue(31);

        sq.deSqueue();

    }
}
