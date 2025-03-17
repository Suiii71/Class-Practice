/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.classpractice;

/**
 *
 * @author Meraj71
 */
public class CountOccarances {
    public static void main(String[]args){
        String sentence= "Java is amazing";
        char word= 'g';
        int length=sentence.length();
        int count=0;
        for (int i=0; i<length; i++){
            if (sentence.charAt(i)==word){
                count=count+1;
            }
        }
        System.out.println("The character " + word +" is seen "+ count+ " times in the sentence");
        
    }
}
