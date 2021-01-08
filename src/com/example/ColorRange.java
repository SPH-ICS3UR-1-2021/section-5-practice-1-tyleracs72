/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a colour code: ");
        
        double waveLength = scan.nextDouble();
        
        if (waveLength >380 && waveLength <450) {
            System.out.println("The coulour is violet");
        }
        else if (waveLength < 380) {
            System.out.println("This is not a part of the visable spectrum");
        }
        else if (waveLength > 450 && waveLength <495) {
            System.out.println("The colour is blue");
        }
        else if (waveLength >495 && waveLength <570) {
            System.out.println("The colur is green");
        }
        else if (waveLength >570 && waveLength <590) {
            System.out.println("The colour is yellow");
        }
        else if (waveLength >590 && waveLength <620) {
            System.out.println("The colour is orange");
        }
        else if (waveLength >620 && waveLength <750) {
            System.out.println("The colour is red");
        }
        else {
            System.out.println("This is not a part of the visable spectrum");
        
        
    }
        }
    }
