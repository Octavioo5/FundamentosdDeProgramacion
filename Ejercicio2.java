/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Sergio Octavio Lopez Sainz 24040636
package ejercicio2;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        int radio = Integer.parseInt(JOptionPane.showInputDialog("Dame el radio:"));
        double area = Math.PI * Math.pow(radio, 2);
          System.out.println("El area del circulo es " + radio + " es: " + area);
        
    }
    
}
