/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.classpractice;

/**
 *
 * @author Meraj71
 */
public class Replcing {
    public static void main(String[] args) {
        String sentence="Java is easy";
        int pos=sentence.indexOf("easy");
        String newText=sentence.substring(0,pos)+ "hard";
        System.out.println(newText);
    
    }
}