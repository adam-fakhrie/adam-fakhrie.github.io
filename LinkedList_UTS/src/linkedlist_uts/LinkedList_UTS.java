package linkedlist_uts;
/**
 *
 * @
 * 
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;

import java.util.InputMismatchException;
import static linkedlist_uts.Insertion.addDataToFirst;
import static linkedlist_uts.Insertion.addDataAtLocation;
import static linkedlist_uts.Insertion.addData;
import static linkedlist_uts.Insertion.addDataToLast;
import static linkedlist_uts.Remove.removeData;
import static linkedlist_uts.Remove.removeDataAtFirst;
import static linkedlist_uts.Remove.removeDataAtLast;
import static linkedlist_uts.Remove.removeAllData;

public class LinkedList_UTS {



//Lingked list
    
public static LinkedList<String> dataStorage = new LinkedList<String>();

// perulangan
    
public static Scanner extracted() {
return new Scanner(System.in);
    }

//input

public static Scanner Input() {
    return new Scanner(System.in);
}
// menampilkan data setelah aksi
    
public static void displayData(){
     if(dataStorage.size()>10){
            dataStorage.removeLast();
            System.out.println("------------------------------------------");
            System.out.println("   ------------------------------------");
            System.out.println("\nData dalam List: " + dataStorage);
            System.out.println("\nTotal Data     : " + dataStorage.size());
            System.out.println("\nAnda tidak dapat menambahkan antrian,\n karena sudah mencapai batas yang ada.\n anda dapat menunggu hingga orang lain selesai");
            System.out.println("   ------------------------------------");
            System.out.println("------------------------------------------");
        }else{
            System.out.println("------------------------------------------");
            System.out.println("   ------------------------------------");
            System.out.println("\nData dalam List: " + dataStorage);
            System.out.println("\nTotal Data     : " + dataStorage.size());
            System.out.println("   ------------------------------------");
            System.out.println("------------------------------------------");
     }

}

//EXIT
    
public static void programExit() {        
System.exit(0);    
}

public static void programTitle() {
        
System.out.println("\nSimple Linked List Program"
        +"\n"
+ "\nProgram Antrian Interview Pembuatan Passport"
+ "\nMaksimal 10 Antrian"
        +"\n"
        +"\n"
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
case 8: removeAllData(); break;
case 9: programTitle(); break;        
case 10: programExit(); break;     
}     
programMenu();  
}

    
public static void programMenu() {
        
System.out.println("\n.: PROGRAM MENU :."
 + "\n 1. Tambahkan Antrian"
 + "\n 2. Tambahkan Antrian dari Awala"
 + "\n 3. Tambahkan Antrian dari Akhir"
 + "\n 4. Tambahkan Antrian dari Index Tertentu"
 + "\n 5. Hapus Data dari Index Tertentu"
 + "\n 6. Hapus Data dari Awal"
 + "\n 7. Hapus Data dari Akhir"
 + "\n 8. Hapus Semua Data"
 + "\n 9. Tentang Program"
 + "\n 10. Keluar Program");       
programSwitcher();  
}  
public static void main(String[] args) {       
programTitle();       
programMenu();
    
}
    

}