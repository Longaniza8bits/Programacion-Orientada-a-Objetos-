
package cuadros;
import java.util.*;
public class Cuadros {

    public static void main(String[] args) {

 Scanner entrada=new Scanner (System.in);
 int X,Y;
 int h=1;
    //Numero de Filas
    System.out.println("Inserte M");    
    Y=entrada.nextInt(); 
    //Numero de Columnas
    System.out.println("Inserte N");    
    X=entrada.nextInt(); 
     int Arreglo[][]= new int [X][Y];       
 //For Para El Mapa de Cruz
 for(int i=0;i<Arreglo.length;i++){
 for(int j=0;j<Arreglo.length;j++){
     int AB=i + 1;
     if((i==j)  ||  (j == (X-AB))){
     Arreglo[i][j]=0;
     System.out.print(Arreglo[i][j]+" ");
     }
     else
     {
     Arreglo[i][j]=1;
     System.out.print(Arreglo[i][j]+" ");
     }      
 } 
 System.out.println("");
 }
 System.out.println("\n");
 //Para Arreglo con forma de escalera
 for(int i=0;i<Arreglo.length;i++){
 for(int j=0;j<Arreglo.length;j++){
     int AB=i + 1;
     if((j == (X-AB))){
     Arreglo[i][j]=0;
     System.out.print(Arreglo[i][j]+" ");
     }
     else
     {
     Arreglo[i][j]=1;
     System.out.print(Arreglo[i][j]+" ");
     }      
 }
  System.out.println();
 }
  System.out.println("\n");
 //Para Arreglo con forma de Cuadro
 for(int i=0;i<Arreglo.length;i++){
 for(int j=0;j<Arreglo.length;j++){
     int AB=j+1;
     /*Explicacion de la Condicion, Dado que Ambos Tienen algo en Similar se puede
     poner un igual*/
     if(i==0 || i==X-1 || j==0 || j==X-1){
     Arreglo[i][j]=0;
     System.out.print(Arreglo[i][j]+" ");
     }
         
     else
     {
     Arreglo[i][j]=1;
     System.out.print(Arreglo[i][j]+" ");
     }      
 }
  System.out.println();
 }
  //For Para El Mapa de Cruz con relleno de lado
 for(int o=0;o<Arreglo.length;o++){   
 for(int p=0;p<Arreglo.length;p++){
     int AB=o + 1;
     if((o==p)  ||  (p == (X-AB))){
     Arreglo[o][p]=0;
     }
     else  
     {
     Arreglo[o][p]=1;
     }  
 }
 }
 //Impresion y Numeracion de el de arriba!
  for(int o=0;o<Arreglo.length;o++){   
 for(int p=0;p<Arreglo.length;p++){
    
     if(Arreglo[o][p]==0||Arreglo[o][p]==1){
     System.out.print(Arreglo[o][p]+" ");
     }
     else  
     {
     Arreglo[o][p]=1;
     System.out.print(Arreglo[o][p]+" ");
     }  
    }
 System.out.println("");
 h=h+1;
 }
  
    }
    
}
