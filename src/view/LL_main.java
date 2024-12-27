/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.Linked_List;
import java.util.Scanner;
/**
 *
 * @author NHIM
 */
public class LL_main {
    public static void main(String[] args) {
        Linked_List sp = new Linked_List();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int data = sc.nextInt();
            sp.addLast(data);
            count++;
            if (count == 4) {
                break;
            }
        }
        sp.printList();
        System.out.println("data cua node so 2: "+sp.getNodeByIndex(2));


        System.out.println("them so 30 va vi tri so 2: ");
        sp.add(30, 2);
        System.out.println("chuoi sau khi them: ");
        sp.printList();

        System.out.println("do dai cua linked list: " + sp.lengthOfList());

        System.out.println("xoa node dau tien trong linked list: " + sp.removeFirst());

        System.out.println("Linked list sau khi xoa: ");
        sp.printList();

        System.out.println("xoa cuoi cung: " + sp.removeLast());

        System.out.println("Linked list sau khi xoa: ");
        sp.printList();

        System.out.println("xoa vi tri so 2: " + sp.removeIndex(2));

        System.out.println("Linked list sau khi xoa: ");
        sp.printList();
    }
}
