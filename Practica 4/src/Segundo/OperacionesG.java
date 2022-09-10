/*Creado por Raul (LonganizaDe8bits) */
package Segundo;
//Clase Hija
//Traemos la libreria Date la cual utilizaremos
import java.util.Date;

//Heredamos con el comando "extends nombre de la clase"
public class OperacionesG extends Mensajes{
//Variables (Objetos) Necesarios Date
//FechaA obtendra la fecha actual
//Ano obtendra el año exacto gracias a fechaA
//La suma de +1900 es necesaria ya que no da la fecha
//Entera si no solo entrega los ultimos 2 decimales y 100 años tipo "122"
    Date fechaA = new Date();
    int ano = (fechaA.getYear()+1900);
    public OperacionesG(){


    }
//Metodo suma, el cual regresara la edad
    public int suma(Date b){
//Obtenemos el año de la fecha que obtenemos
//No olvidemos sumar 1900
        int fecha=(b.getYear()+1900);
        int edad;
       /* PRUEBAS  System.out.println("Año por fecha"+fecha);
        System.out.println("Año por b"+(b.getYear()+1900));
        System.out.println("B sin suma"+b.getYear());
        System.out.println("Año sin suma"+ano);*/
//Aqui la calculamos
 //Aqui acondicionamos
        //Si Mes es mayor es obvio que ya paso tu cumpleaños
        if(b.getMonth()<fechaA.getMonth()){
            edad=ano-fecha;
        }
        //Si el Mes es igual, pues queda comprobar el dia
        //Si el dia es exactamente ese o es mayor pues ya los cumplio
        else if(b.getMonth()==fechaA.getMonth()&&b.getDay()>=fechaA.getDay()){
            edad=ano-fecha;
        }
        //En otro caso pues no los haz cumpli por eso le quito 1
        else{
            edad=(ano-fecha)-1;
        }

        
//Returnamos edad
        return edad;
    }

//metodo imprimir
/*Recordemos que imprimir ya es un metodo
 * heredado de Mensajes (padre) por lo tanto ya
 * contamos con al momento de invocarlo en otra
 * clase te saldra un vacio que es el heredado, y 
 * este asi que hay que especificar 
 */
    public void imprimir(String nom,int edad){
        super.imprimir();
        System.out.println(nom);
        System.out.println("Tu Edad es: ");
        System.out.println(edad);
    }

    


}