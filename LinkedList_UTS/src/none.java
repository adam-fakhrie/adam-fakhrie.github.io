package linkedlist_uts;
/**
 *
 * @
 * 
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;


public class LinkedList_UTS {



//Lingked list
    
public static LinkedList<String> dataStorage = new LinkedList<String>();

//Agar Berulang
    
public static Scanner extracted() {
return new Scanner(System.in);
    }

//input

public static Scanner Input() {
    return new Scanner(System.in);
}
//agar menampilkan data setelah aksi
    
public static void displayData(){
System.out.println("\nData dalam List: " + dataStorage);
System.out.println("Total Data     : " + dataStorage.size());
}

//Add_data1
    
private static void addData() {
System.out.print("Masukkan Data: ");
String tempData = extracted().nextLine();
dataStorage.add(tempData);
    displayData();
}

//Add_data2
    
private static void addDataAtLocation() {
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
    
private static void addDataToFirst() {
System.out.print("Masukkan Data: ");
String tempData = extracted().nextLine();
dataStorage.addFirst(tempData);
displayData();
 }

//Add_data HEAD or TAIL
    
private static void addDataToLast() {
System.out.print("Masukkan Data: ");
String tempData = extracted().nextLine();
dataStorage.addLast(tempData);
displayData();
}

//SEARCH
    
private static boolean searchData(String data) {
return dataStorage.contains(data);
    }

//REMOVE
    
private static void removeData() {
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
    
private static void removeDataAtFirst() {        
dataStorage.removeFirst();        
displayData();    
}

//REMOVE last
    
private static void removeDataAtLast() {        
dataStorage.removeLast();        
displayData();    
}

//REMOVE By Content 
    
private static void removeDataByContent() {
 
displayData();        
System.out.print("Masukkan Data yang ingin dihapus: ");        
String data = extracted().nextLine();        
if(searchData(data)) {            
dataStorage.remove(data);        
}
        
else {            
System.out.println("Anda memasukkan data yang tidak tersimpan di dalam list");        
}        
displayData();    
}

//EXIT
    
public static void programExit() {        
System.exit(0);    
}

    
public static void programTitle() {
        
System.out.println("\nSimple Linked List Program"
+ "\nDitulis dalam bahasa pemrograman Java"
+ "\nOleh: Adam Fakhri Fakhruddin"+ "\nMahasiswa Teknik Informatika UNIDA Gontor\n");    
}

    
public static void programSwitcher() {        
boolean status = true;        
int indexMenu = 0;        
while(status) {            
try {
                
status = false;                
System.out.print("Pilih Menu [1~9]: ");                
indexMenu = extracted().nextInt();            
}
            
catch(InputMismatchException e) {                
System.out.println("Masukan harus berupa Angka!");                
status = true;            
}
        
}

switch(indexMenu) {
case 1: addData(); break;
case 2: addDataToFirst(); break;
case 3: addDataToLast(); break;
case 4: addDataAtLocation(); break;
case 5: removeData(); break;
case 6: removeDataAtFirst(); break;
case 7: removeDataAtLast(); break;
case 8: removeDataByContent(); break;
case 9: programTitle(); break;        
case 10: programExit(); break;     
}     
programMenu();  
}

    
public static void programMenu() {
        
System.out.println("\n.: PROGRAM MENU :."
 + "\n 1. Add Data"
 + "\n 2. Add Data at First"
 + "\n 3. Add Data at Last"
 + "\n 4. Add Data at N Index"+ "\n 5. Remove Data at N Index"
  + "\n 6. Remove Data at First"+ "\n 7. Remove Data at Last"+ "\n 8. Remove Data by Data Content"
+ "\n 9. About Program"
+ "\n10. Program Exit");       
programSwitcher();  
}  
public static void main(String[] args) {       
programTitle();       
programMenu();
    
}
    

}