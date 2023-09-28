package Exercise1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muhammadazhar
 */
public class Prisoner {
    
    public String name;
    public int sentence;
    public Cell cell;
    
    
    public Prisoner (){
 	this("",0);
    }
    
    public Prisoner(String name, int sentence){
        this.name = name;
        this.sentence = sentence;
    }
    //Exercise 1 Part 1
    public Prisoner(String name, int sentence, String n, boolean o){
        this(name, sentence);
        cell.name = n;
        cell.isOpen = o;
    }
    //Exercise 1 Part 1
    public Prisoner (String name, int sentence, Cell c){
        this (name, sentence);
        cell = c;
    }
    
    
    public void think(){
        System.out.println("Processing");
    }
    //Exercise 1, Part 2
    public void open(){
        cell.isOpen = !cell.isOpen;
        if (cell.isOpen){
            System.out.println("the door is open");
        } else {
            System.out.println("the door is closed");
        }
        
    }
    //Exercise 1 Part 1
    public void display(){
        System.out.println(name + "from" + cell.name + "cell");
    }
}
