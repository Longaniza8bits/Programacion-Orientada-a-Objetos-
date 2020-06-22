package pareimpar;
//Aleatorio
import java.util.Random;
public class PareImpar {
    public static void main(String[] args) {
        //Objeto Random para usar la libera de aleatorio
  Random random=new Random();
  //Arreglo de 20 numeros
    int ArrayInt[]=new int[20];  
 for(int hola=0; hola<ArrayInt.length; hola++){
 
 ArrayInt[hola]=random.nextInt(101);
 if(ArrayInt[hola]%2==0){
 System.out.print(" "+ArrayInt[hola]+" ");
 }
 
 }
 
 for(int i=0; i<20; i++){
 if(ArrayInt[i]%2==0){
 }
 else{
System.out.print(" "+ArrayInt[i]+" ");    
 }
     
     
 }
 
 
 System.out.println("");
 
    
    
    }
    
}
