/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crucigrama;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Crucigrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] cadena = new String[5];

        cadena[0] = "coco";
        cadena[1] = "coca";
        cadena[2] = "arroz";
        cadena[3] = "cafe";
        cadena[4] = "programacion";
       

        boolean m;
        int n =1;
        for (int i = 0; i < cadena.length; i++) {
            for (int j = i + 1; j < cadena.length; j++) {
                m = false;

                for (int k = 0; k < cadena[i].length(); k++) {
                    if (cadena[j].indexOf(cadena[i].charAt(k)) != -1) {
                        System.out.println( n+++ "->" +cadena[i] + " -SE CRUZA CON- " + cadena[j]);
                        System.out.println("------------------------------------------");
                        m = true;
                        break;
                    }
                }

                if (m) {
                    break;
                }
            }
        }
    }
}
