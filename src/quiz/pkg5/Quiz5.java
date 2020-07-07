/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg5;

import doublylinkedlist.DNode;

/**
 *
 * @author admin
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNode<String> Transaction1 = new DNode(null,"Person 1", null);
        DNode<String> Transaction2 = new DNode(null,"Person 2", null);
        DNode<String> Transaction3 = new DNode(null,"Person 3", null);
        DNode<String> Transaction4 = new DNode(null,"Person 4", null);
        DNode<String> Transaction5 = new DNode(null,"Person 5", null);
        
        
        Register<DNode> transaction = new Register<>();
        
        try{
        transaction.addLast(Transaction1);
        transaction.addLast(Transaction2);
        transaction.addFirst(Transaction3);
        transaction.addFirst(Transaction4);
        transaction.addFirst(Transaction5);
        
         System.out.println("List of Transactions: \n");
         transaction.showTransaction();
    
          System.out.println("\nRemove First: " + transaction.removeFirst().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
          
          System.out.println("\nRemove First: " + transaction.removeFirst().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
    
          System.out.println("\nRemove Last: " + transaction.removeLast().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
          
           System.out.println("\nRemove Last: " + transaction.removeLast().getElement());
          System.out.print("\nAfter Remove: "+"\n");
          transaction.showTransaction();
          
          
          } catch (EmptyTransaction ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
