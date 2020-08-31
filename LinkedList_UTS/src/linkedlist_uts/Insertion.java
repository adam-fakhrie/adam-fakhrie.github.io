package linkedlist_uts;


import java.util.InputMismatchException;
import static linkedlist_uts.LinkedList_UTS.dataStorage;
import static linkedlist_uts.LinkedList_UTS.displayData;
import static linkedlist_uts.LinkedList_UTS.extracted;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PKU
 */
public class Insertion {
    
//Add_data1
    
public static void addData() {
System.out.print("Masukkan Data: ");
String tempData = extracted().nextLine();
dataStorage.add(tempData);
    displayData();
}

//Add_data2
    
public static void addDataAtLocation() {
boolean status = true;
int indexData = 0;
displayData();
while(status) {
System.out.print("Pilih Index Data yang ingin disisipi data: [0-" + (dataStorage.size() - 1) + "]: ");
try {  
status = false;  
indexData = extracted().nextInt();
}
catch(InputMismatchException e) {      
System.out.println("Data harus berupa Angka!");      
status = true;
            }
        }
        
System.out.print("Data yang ingin disisipkan pada index data ke- " + indexData + ": ");
String tempData = extracted().nextLine();
dataStorage.add(indexData, tempData);
displayData();
}
//Add_data HEAD or TAIL
    
public static void addDataToFirst() {
System.out.print("Masukkan Data: ");
String tempData = extracted().nextLine();
dataStorage.addFirst(tempData);
displayData();
 }

//Add_data HEAD or TAIL
    
public static void addDataToLast() {
System.out.print("Masukkan Data: ");
String tempData = extracted().nextLine();
dataStorage.addLast(tempData);
displayData();
}

   

    
}
