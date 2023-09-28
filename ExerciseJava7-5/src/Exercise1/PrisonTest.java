package Exercise1;

import Exercise1.Prisoner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muhammadazhar
 */
//Exercise 1 Part 2
public class PrisonTest {
    public static void main(String[] args){
       Cell cell = new Cell("VIP",false);
       Prisoner bubba = new Prisoner ("Sambo",99,cell);
       
       bubba.display();
       bubba.open();
       bubba.open();
       bubba.open();
       
    }
}
