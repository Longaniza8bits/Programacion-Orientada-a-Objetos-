package Primero;
//Instanciar Mediante Generalizacion (Heredar)
/* Hecho el 09/09/2022
 Por Raul (Longanizade8bits)
 el formato correcto para usar con dia,mes y año es dd/MM/yyyy cuidado 
 con usar Mayusculas yo tube ese error!.
*/


//Librerias y Clases.
import Segundo.OperacionesG;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;


public class PrincipalG{

    

    public static void main(String args[])throws Exception {
        
        //Variables necesarias.
        OperacionesG ope = new OperacionesG();
        Scanner entrada = new Scanner(System.in);
        //Le da formato al simple formato date
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = new Date();

        //Solicitar los datos
        //Tenemos que especificar al usuario como lo queremos

        System.out.println("Ingresar Nombre: ");
        String nom= entrada.nextLine();
        System.out.println("Ingresar Cumpleaños Ejemplo:20/02/2001");
        String fechaR = entrada.nextLine();
        
        //Aqui guardamos la fecha
        fecha = format.parse(fechaR);
    
        
       // ope.suma(nom,fecha); PRUEBA
        //llamamos el objeto imprimir al cual le mandaremos
        //El Nombre y el Resultado de la edad el cual obtenemos con
        //el metodo suma el cual solo basta con mandar "fecha" Que es el tipo Date
        ope.imprimir(nom,ope.suma(fecha));
        



    }



}