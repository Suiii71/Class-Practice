/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.classpractice;

/**
 *
 * @author Meraj71
 */
public class Replaceall {
    public static void main(String[]args){
        String sentence="Python is not that difficult. Python is easy";
        String newSentence=sentence.replaceAll("Python", "Java");
        System.out.println("Current text :" + sentence);
        System.out.println("Updated to :" +newSentence);
    
    }
}
