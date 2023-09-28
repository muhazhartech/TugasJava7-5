package Exercise3;


import Exercise3.Cell;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muhammadazhar
 */
//Exercise 3 Part 2

public class PrisonTest {
    public static void main(String[] args) {
        // Membuat objek Cell dengan kode keamanan 1234
        Cell cell = new Cell("VIP", false, 1234);
        
        // Membuat objek Prisoner dengan nama Sambo dan sel VIP
        Prisoner bubba = new Prisoner("Sambo", 99, cell);
        
        // Menampilkan nama sel
        bubba.display();
        
        // Membuka pintu dengan kode keamanan yang salah
        cell.toggleDoor(4321); // Ini akan mencetak "Kode keamanan salah!"
        
        // Membuka pintu dengan kode keamanan yang benar
        cell.toggleDoor(1234); // Ini akan mencetak "Pintu dibuka."
        
        // Menutup pintu dengan kode keamanan yang benar
        cell.toggleDoor(1234); // Ini akan mencetak "Pintu ditutup."
    }
}

