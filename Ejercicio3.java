package ejercicio3;
import javax.swing.JOptionPane;

//Sergio Octavio Lopez Sainz 24040636
public class Ejercicio3 {

    public static void main(String[] args) {
        int radio = Integer.parseInt(JOptionPane.showInputDialog("Dame el radio de la circuferencia:")); 
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro es " + radio + " es: " + perimetro);
        
        
    }
    
}
