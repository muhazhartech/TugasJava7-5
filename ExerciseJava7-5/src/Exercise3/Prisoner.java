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
    
    public Prisoner(String name, int sentence, String n, boolean o){
        this(name, sentence);
        cell = new Cell(n, o, sentence);
    }
    
    public Prisoner(String name, int sentence, Cell c){
        this(name, sentence);
        cell = c;
    }
    
    public void think(){
        System.out.println("Processing");
    }
    
    public void display(){
        System.out.println(name + " from " + cell.getName() + " cell"); 
    }
}

