//Huerta Neria Raúl 3S11
package colas;
import java.util.Scanner; //Ocupamos introducir datos
import java.util.Random; //Generar nuestras numeraciones aleatorias
public class PilaAB {

    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in); //Metodo
    Random random=new Random();//Metodo
    int opt;
    System.out.println("-------------------------------------------------------------------------\n");
    System.out.println("Introduzca el Tamaño de Su Pila");
    int pilatamano=entrada.nextInt();
    System.out.println("-------------------------------------------------------------------------\n");
    int pilaA[]=new int[pilatamano];
    int pilaB[]=new int[pilatamano];
    int pilaC[]=new int[pilatamano];
    do{
      //Menu  
    System.out.println("-------------------------------------------------------------------------\n");
    System.out.println("Bienvenidos\n"
            +"1.-Llenar Pilas (A,B)\n"
            +"2.-Mostrar Pilas (A,B)\n"
            +"3.-Vaciar pilas A,B\n"
            +"4.-Llenar pila C\n"
            +"5.-Mostrar Pila C\n"
            +"6.-Salir");
    opt=entrada.nextInt();
     System.out.println("-------------------------------------------------------------------------\n");
        //Llenado de las pilas 
     switch(opt){
     
         case 1:
             for(int i=0; i<pilaA.length; i++){
             pilaA[i]=random.nextInt(100-1+1)+1;
             pilaB[i]=random.nextInt(200-100+1)+100;    
             }
             break;
         case 2:
             System.out.println("-------------------------------------------------------------------------\n");
             for(int i=0; i<pilaA.length; i++){
               if(pilaA[i]!=0&&pilaB[i]!=0){
               System.out.println("Esta Es La Pila A: "+pilaA[i]);  
               System.out.println("Esta Es La Pila B: "+pilaB[i]);
               }  
         }  System.out.println("-------------------------------------------------------------------------\n");
             break;
             
         case 3:
             System.out.println("-------------------------------------------------------------------------\n");
             
             for(int i=0; i<pilaA.length; i++){
             pilaA[i]=0;
             pilaB[i]=0;
             pilaC[i]=0;
             }
             System.out.println("Borrado Correctamente");
             System.out.println("-------------------------------------------------------------------------\n");
             break;
         case 4:
             int j=0;
              for(int i=pilaA.length-1; i>=0; i--){
                  pilaC[j]=pilaA[i]+pilaB[i]; 
                  j++;
              }
             break;
         case 5:
        System.out.println("-------------------------------------------------------------------------\n");
             for(int i=0; i<pilaA.length; i++){
               if(pilaC[i]!=0){
               
               System.out.println("Esta Es La Pila C"+pilaC[i]);  
               
               
               }  
         }  System.out.println("-------------------------------------------------------------------------\n");
             break;
             
         
     }
        
        
        }while(opt!=6);
    }
    
}
