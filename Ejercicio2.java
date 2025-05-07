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
