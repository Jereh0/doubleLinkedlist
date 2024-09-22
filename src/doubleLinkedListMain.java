/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class doubleLinkedListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     doubleLinkedListClass linkedlist = new doubleLinkedListClass();
        linkedlist.addNode(1);
        linkedlist.addNode(2);
        linkedlist.addNode(3);
        linkedlist.addNode(4);
        linkedlist.addNode(5);
        
        System.out.println("Elements of array: ");
        linkedlist.display();
        System.out.println("\nFirst Node Deleted.");
        linkedlist.deleteFirstNode();
        linkedlist.display();
        System.out.println("\nLast Node Deleted.");
        linkedlist.deleteLastNode();
        linkedlist.display();
        System.out.println("\nNumber 3 Node Deleted.");
        linkedlist.deleteAnywhere(3);
        linkedlist.display();
    }
}
