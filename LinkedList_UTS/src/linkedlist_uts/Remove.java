/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_uts;

import java.util.InputMismatchException;
import static linkedlist_uts.LinkedList_UTS.dataStorage;
import static linkedlist_uts.LinkedList_UTS.displayData;
import static linkedlist_uts.LinkedList_UTS.extracted;


/**
 *
 * @author PKU
 */
public class Remove {
    //REMOVE
    
public static void removeData() {
boolean status = true;
int indexData = 0;
displayData();
while(status) {
System.out.print("Pilih Index Data yang ingin dihapus: [0-" + (dataStorage.size() - 1) + "]: ");
            
try {
    status = false;
    indexData = extracted().nextInt();
            
}
catch(InputMismatchException e) {  
System.out.println("Data harus berupa Angka!");  
status = true;
}
        
}
dataStorage.remove(indexData);
displayData();    
}

//REMOVE first
    
public static void removeDataAtFirst() {        
dataStorage.removeFirst();        
displayData();    
}

//REMOVE all

public static void removeAllData() {        
dataStorage.removeAll(dataStorage);        
displayData();    
}

//REMOVE last
    
public static void removeDataAtLast() {        
dataStorage.removeLast();        
displayData();    
}
 public static void auto() {
        if(dataStorage.size()>3){
            dataStorage.removeFirst();
        }
    }

}
