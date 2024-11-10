/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionesconletras;

/**
 *
 * @author jcplo
 */
public class Calificacionesconletras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresar calificación: ");
    double calificacion = scanner.nextDouble();     
    char letra;
    if (calificacion >= 90 && calificacion <= 100){
    letra = 'A'; 
    }else if (calificacion >= 80 && calificacion < 90){
    letra = 'B'; 
    }else if (calificacion >= 70 && calificacion < 80){
    letra = 'C';  
    }else if (calificacion >= 60 && calificacion < 70) {
    letra = 'D';  
    }else if (calificacion < 60) {
    letra = 'F';  
    }else {
    System.out.println("La calificación debe estar entre 0 y 100.");
    return;  
    }    
    System.out.println("La calificación es: " + letra);
    scanner.close();
    }   
}
