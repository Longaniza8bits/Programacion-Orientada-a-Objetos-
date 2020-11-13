package colas;
import java.util.Random;
import java.util.Scanner;
public class Pila14 {

    
    public static void main(String[] args) {
  Scanner entrada=new Scanner(System.in);
  Random alazar=new Random();
  String dato=("0"); 
 char arregloletras[]=new char[26];
 char asciii=65;
 String letras[]=new String[26];
 int ascii[]=new int[26];
 int opc;
do{
 System.out.println("1.-Llena\n"
        +"2.-Mostrar\n"
        +"3.-Eliminar\n"
        +"4.-Llenado Aleatorio\n"
        +"5.-Ordenado\n"
        +"6.-Manual\n"
         +"7.-Mostrar sin repetir\n"
 +"8.-Salida");
   opc=entrada.nextInt();
switch(opc)   {
    case 1:
   System.out.println("Comenzando llenado");     
   for(int i=0; i<arregloletras.length; i++){   
   arregloletras[i]=asciii;
   asciii++;
   letras[i]=Character.toString(arregloletras[i]);
   }
   System.out.println("llenado Correctamente");
    break;
    
    case 2:
    for(int i=0; i<ascii.length; i++){
      if(letras[i]!=null){
        System.out.println("Abecedario: "+
          letras[i]); }        
    }
    
    break;
    case 3:
     for(int i=0; i<ascii.length; i++){
     letras[i]=null;
     }   
        
    break;   
    
    case 4:
      for(int i=0; i<ascii.length; i++){
      ascii[i]=alazar.nextInt(90-65+1)+65;
      arregloletras[i]=(char)ascii[i];   
      letras[i]=Character.toString(arregloletras[i]);    
     }             
    break;
  
    case 5:
 for(int i=0;i<letras.length;i++){
  for(int j=i+1;j<letras.length;j++){
   if(ascii[i]>ascii[j])
   {
   int aux=ascii[j];
    ascii[j]=ascii[i];
    ascii[i]=aux;
   }      
  }
}
    for(int i=0; i<ascii.length; i++){
      arregloletras[i]=(char)ascii[i];   
      letras[i]=Character.toString(arregloletras[i]);    
     }          
        break;
    case 6:
       int optc;
       int medidor=0;  
       do{
         System.out.println("Ingrese el dato en la posicon ["+medidor+"]");
         letras[medidor]=entrada.next();
          System.out.println("Quieres llenar otro?\n"+"1.-Si"+"2.-No");
          optc=entrada.nextInt();
          medidor++;
        }while(optc!=2);
        break;
    case 7:
   
         int h=1;
            for(int i=0; i<arregloletras.length; i++){
                if(h==arregloletras.length){
                   h=arregloletras.length-2;
      
                }
              if(arregloletras[i]==arregloletras[h]){
    
               arregloletras[i]=48;
               letras[i]=Character.toString(arregloletras[i]);
              }
              else{
              }
            h++;
            }
        
        
        
        
        for(int i=0; i<ascii.length; i++){
        if(letras[i]!=null&&arregloletras[i]!=48){
        System.out.println("Abecedario: "+
          letras[i]); }        
        }
        break;
    }

 
    }while(opc!=8);
}
}