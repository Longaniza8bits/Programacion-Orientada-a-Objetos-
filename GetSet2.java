//Programacion 2S11
package getset2;
import java.util.Scanner;

public class GetSet2 {

   
    public static void main(String[] args) {
     boolean dato=false;   
     int j=1;
String nombre;
String apellido;
int edad;
String nombre2;
String apellido2;
int edad2;
String nombre3;
String apellido3;
int edad3;
String nombre4;
String apellido4;
int edad4;
String nombre5;
String apellido5;
int edad5;
     Scanner entrada=new Scanner(System.in);
     Empleado e1=new Empleado();
     Empleado e2=new Empleado();
     Empleado e3=new Empleado();
     Empleado e4=new Empleado();
     Empleado e5=new Empleado();
     
     int opcion=0,opt;
     do{
     System.out.println("Bienvenido Seleccione lo que solicita hacer");
     System.out.println("1.-Ingresar Datos\t\t"+"2.-Modificar Datos\t\t"+"3.-Ver Datos");
     opt=entrada.nextInt();
     switch(opt){ 
         
         case 1:   
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre=entrada.nextLine();
     nombre=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad=entrada.nextInt();
     e1.setNombre(nombre);
     e1.setApellido(apellido);
     e1.setEdad(edad);
     j++;
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre2=entrada.nextLine();
      nombre2=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido2=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad2=entrada.nextInt();
     e2.setNombre2(nombre2);
     e2.setApellido2(apellido2);
     e2.setEdad2(edad2);
     j++;
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre3=entrada.nextLine();
     nombre3=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido3=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad3=entrada.nextInt();
     e3.setNombre3(nombre3);
     e3.setApellido3(apellido3);
     e3.setEdad3(edad3);
     j++;
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre4=entrada.nextLine();
     nombre4=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido4=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad4=entrada.nextInt();
     e4.setNombre4(nombre4);
     e4.setApellido4(apellido4);
     e4.setEdad4(edad4);
     j++;
     System.out.println("Ingrese los Datos del Empleado "+j);
     System.out.println("Ingrese El nombre");
     nombre5=entrada.nextLine();
     nombre5=entrada.nextLine();
     System.out.println("Ingrese el Apellido");
     apellido5=entrada.nextLine();
     System.out.println("Ingrese La Edad");
     edad5=entrada.nextInt();
     e5.setNombre5(nombre5);
     e5.setApellido5(apellido5);
     e5.setEdad5(edad5);
     j++;
     System.out.println("Desea hacer otra accion\n");
     System.out.println("1.-Si\t\t"+"2.-No");
     opcion=entrada.nextInt();
     dato=true;
     break;
     
         case 2:
     System.out.println("Que desea modificar?");
     System.out.println("1.-Nombre\t"+"2.-Apellido\t"+"3.-Edad\t");
     int NomModi=entrada.nextInt();        
        switch(NomModi){
            case 1:    
        System.out.println("Que empleado desea modificar?");
        System.out.println("1,2,3,4,5");
        int emplea=entrada.nextInt();
        switch(emplea){
            case 1:
        System.out.println("ingrese el nombre");
        String replace=entrada.nextLine();
       replace=entrada.nextLine();
        e1.setNombre(replace);
            break;
            case 2:
        System.out.println("ingrese el nombre");
        String replace2=entrada.nextLine();
        replace2=entrada.nextLine();
        e2.setNombre2(replace2);
            break;
            case 3:
        System.out.println("ingrese el nombre");
        String replace3=entrada.nextLine();
        replace3=entrada.nextLine();
        e3.setNombre3(replace3);
            break;
             case 4:
        System.out.println("ingrese el nombre");
        String replace4=entrada.nextLine();
                replace4=entrada.nextLine();
        e4.setNombre4(replace4);
            break;
            case 5:
        System.out.println("ingrese el nombre");
        String replace5=entrada.nextLine();
        replace5=entrada.nextLine();
        e5.setNombre5(replace5);
            break;
        }
            break;
            case 2:
       System.out.println("Que empleado desea modificar?");
        System.out.println("1,2,3,4,5");
        int emple=entrada.nextInt();
        switch(emple){
            case 1:
        System.out.println("ingrese el Apellido");
        String replace=entrada.nextLine();
        replace=entrada.nextLine();
        e1.setApellido(replace);
            break;
            case 2:
        System.out.println("ingrese el Apellido");
        String replace2=entrada.nextLine();
        replace2=entrada.nextLine();
        e2.setApellido(replace2);
            break;
            case 3:
        System.out.println("ingrese el Apellido");
        String replace3=entrada.nextLine();
        replace3=entrada.nextLine();
        e3.setApellido3(replace3);
            break;
             case 4:
        System.out.println("ingrese el Apellido");
        String replace4=entrada.nextLine();
        replace4=entrada.nextLine();
        e4.setApellido4(replace4);
            break;
            case 5:
        System.out.println("ingrese el Apellido");
        String replace5=entrada.nextLine();
        replace5=entrada.nextLine();
        e5.setApellido5(replace5);
            break;
        }    
            break;
            case 3:
             System.out.println("Que empleado desea modificar?");
        System.out.println("1,2,3,4,5");
        int empl=entrada.nextInt();
        switch(empl){
            case 1:
        System.out.println("ingrese el Edad");
        int replace=entrada.nextInt();
        e1.setEdad(replace);
            break;
            case 2:
        System.out.println("ingrese el Edad");
       int replace2=entrada.nextInt();
        e2.setEdad2(replace2);
            break;
            case 3:
        System.out.println("ingrese el Edad");
          int replace3=entrada.nextInt();
        e3.setEdad3(replace3);
            break;
             case 4:
        System.out.println("ingrese el Edad");
        int replace4=entrada.nextInt();
        e4.setEdad4(replace4);
            break;
            case 5:
        System.out.println("ingrese el Edad");
        int replace5=entrada.nextInt();
        e5.setEdad5(replace5);
        }
            break;    
                
            
        }     
     System.out.println("Desea hacer otra accion\n");
     System.out.println("1.-Si\t\t"+"2.-No");
     opcion=entrada.nextInt();    
         break;    
     
         case 3:
        if(dato==false){
        System.out.println("Aun no hay registros\n");
        }     
        else{     
        e1.mensaje();
        e2.mensaje2();
        e3.mensaje3();
        e4.mensaje4();
        e5.mensaje5();
        }
     System.out.println("Desea hacer otra accion\n");
     System.out.println("1.-Si\t\t"+"2.-No");
     opcion=entrada.nextInt();
         break;
         default:
       System.out.println("Error seleccione de nuevo");
       opcion=1;
         break;    
     }
     }while(opcion==1); 
        
    }
    
}
