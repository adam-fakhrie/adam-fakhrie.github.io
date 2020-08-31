package main1;

public class LinkedList {
    
    Node head = null;
    Node tail = null;

    public void add(int value) {
        
        Node n = new Node();
        n.setAngka(value);

        if (head == null) {
            
            head = n;
            tail = n;
            
        }else{
            
            tail.setNextNode(n);
            tail = n;
            
        }
    }
    
    public boolean remove(int value){
        
        if (this.head == null) {
            return false;
        }
        
        Node n = this.head;
        
        if (n.getAngka() == value) {
            
            if (this.head == this.tail){
                this.head=null;
                this.tail=null;
                
            }else {
                
                this.head = this.head.getNextNode();
            }
            
            return true;
        }
        
        while (n.getNextNode() != null && n.getNextNode().getAngka() == value ){
            n=n.getNextNode();
        }
        
        if(n.getNextNode() != null) {
            if (n.getNextNode().getAngka() == tail.getAngka()){
                this.tail = n;
            }
            n.setNextNode(n.getNextNode().getNextNode());
        }
        return false;
    }
    
     public boolean contains(int value) {
         Node n = this.tail;
         while (n != null && n.getAngka() == value) {
             n = n.getNextNode();
         }
         if ( n == null){
             return false;
         }
         return false;
     }
     
     public String txt() {
         
         String output ="";
         Node n = this.head;
         while (n != null) {
             output += n.getAngka() + "";
             n = n.getNextNode();
             
         }
         return output;
     }
}
