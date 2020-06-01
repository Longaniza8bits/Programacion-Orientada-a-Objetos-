//Clase Main
package imc;
import java.util.Scanner;
import imc.Calcular;
import imc.Persona;
public class IMC {

    
    public static void main(String[] args) {
    //Variables
    String Nombre;
    String Genero;
    int edad;
    double peso;
    double estatura;       
//Scanner
    Scanner entrada=new Scanner (System.in);  
    //Polimorfismo Pediente a experimentar
    Persona e1=new Calcular();
    //Objeto Calcular
    Calcular e2=new Calcular();
    //Solicitud
    System.out.println("Ingrese su nombre");  
    Nombre=entrada.nextLine();
    System.out.println("Ingrese su genero");
    Genero=entrada.nextLine();
    System.out.println("Ingrese su edad");
    edad=entrada.nextInt();
    System.out.println("Ingrese su peso");
    peso=entrada.nextDouble();
    System.out.println("Ingrese su Tamaño");
    estatura=entrada.nextDouble();
    //Le Estoy Mandando los datos a la clase
    e1.setNombre(Nombre);
    e1.setSexo(Genero);
    e1.setEdad(edad);
    e1.setPeso(peso);
    e1.setEstatura(estatura);
    e1.calcular();

    e1.derechos();
    
    
        
    }
    
}
