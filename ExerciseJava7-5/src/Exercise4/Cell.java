package Exercise4;

import Exercise3.*;
import Exercise1.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muhammadazhar
 */

public class Cell {
    private String name;
    private boolean isOpen;
    private int securityCode;

    public Cell(String n, boolean o, int code) {
        name = n;
        isOpen = o;
        securityCode = code;
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Getter untuk isOpen
    public boolean isOpen() {
        return isOpen;
    }

    // Setter untuk membuka/menutup pintu
    public void toggleDoor(int code) {
        if (code != securityCode) {
            System.out.println("Kode keamanan salah!");
        } else {
            if (isOpen) {
                isOpen = false;
                System.out.println("Pintu ditutup.");
            } else {
                isOpen = true;
                System.out.println("Pintu dibuka.");
            }
        }
    }
}

