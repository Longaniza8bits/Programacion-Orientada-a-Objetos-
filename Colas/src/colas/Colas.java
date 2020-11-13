package colas;
import java.util.Scanner;
public class Colas {

    public static void main(String[] args) {
      
      Scanner lector=new Scanner (System.in);
        int opc;
        do{
      System.out.println("Seleccione una opcion\n"+"1.-PilaAB en Cola\n"
              +"2.-PilaABC en Cola\n"
              +"3.-Pila Agregando en cola\n"
              +"4.-Salir");
      opc=lector.nextInt();  
      switch(opc){
      
          case 1:
              PilaAB.main(args);
              break;
              
          case 2:
              Pila14.main(args);
              break;
          case 3:
              Pilas.main(args);
              break;
          case 4:
              
              break;
          default:
              System.out.println("invalido");
              break;
      }
          
      }while(opc!=4);
      
    }
    
}
