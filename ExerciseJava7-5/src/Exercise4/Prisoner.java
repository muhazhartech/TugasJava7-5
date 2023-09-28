package Exercise4;


import Exercise3.*;
import Exercise3.Cell;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muhammadazhar
 */

//Exercise 4


public class Prisoner {
    private String name;
    private int sentence;
    private Cell cell;

    public Prisoner() {
        this("", 0);
    }

    public Prisoner(String name, int sentence) {
        this.name = name;
        this.sentence = sentence;
    }

    public Prisoner(String name, int sentence, String cellName, boolean isOpen) {
        this(name, sentence);
        cell = new Cell(cellName, isOpen, sentence);
    }

    public Prisoner(String name, int sentence, Cell c) {
        this(name, sentence);
        cell = c;
    }

    public void think() {
        System.out.println("Processing");
    }

    public void display() {
        System.out.println(name + " from " + cell.getName() + " cell");
    }

    // Getter untuk name
    public String getName() {
        return name;
    }

    // Setter untuk name
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk sentence
    public int getSentence() {
        return sentence;
    }

    // Setter untuk sentence
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    // Getter untuk cell
    public Cell getCell() {
        return cell;
    }

    // Setter untuk cell
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}

