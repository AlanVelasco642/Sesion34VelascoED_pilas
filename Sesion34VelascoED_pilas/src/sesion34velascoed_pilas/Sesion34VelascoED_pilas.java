/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion34velascoed_pilas;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Clases
 */
public class Sesion34VelascoED_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de Pila
        Stack<Integer> pilaVelasco=new Stack<>();
                pilaVelasco.push(100);
                pilaVelasco.push(150);
                pilaVelasco.push(230);
                pilaVelasco.push(10);
                pilaVelasco.push(160);
                JOptionPane.showMessageDialog(null, "Datos en pila ordenada es: \n"+pilaVelasco);
    }
    
}
