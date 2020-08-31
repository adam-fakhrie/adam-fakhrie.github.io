/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author PC - 07
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(40);
        ll.add(100);
        ll.add(200);
        
        System.out.println(ll.contains(150));
        System.out.println(ll.contains(100));
        
        System.out.println(ll.txt());
    }
    
}
