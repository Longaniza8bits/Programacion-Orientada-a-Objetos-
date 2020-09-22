package pila;

import java.util.Scanner;


public class Pila {
    

 
    
    
    public static void main(String[] args) {
        
    Scanner entrada=new Scanner(System.in);
  int pilatamano=26,opt;
  String letra[]=new String[pilatamano];
  String conversor[]=new String[pilatamano];
    char comparador[]=new char[pilatamano];
    char abe=65;
    
       do{  
    System.out.println("Bienvenido Pila abecedario,¿Qué desea hacer?\n"
            +"1.-AutoLlenado\n"+
            "2.-Llenado selectivo\n"
            +"3.-Mostra\n"+
            "4.-Eliminar\n"
            +"5.-Salir"
            );
            opt=entrada.nextInt();
    switch(opt){
        case 1:  
        for(int i=0; i<comparador.length; i++){
           if(letra[i]==null){
        comparador[i]=abe;
        conversor[i]=Character.toString(comparador[i]);
        letra[i]=conversor[i];
        abe++;
           }
           else{
           System.out.println("Muestra contador"+i);
           i++;
           }
        }
    
        break;
        case 2:
            for(int i=0; i<comparador.length; i++){
            System.out.println("Llenar el renglon:"+i);
            letra[i]=entrada.next();
            System.out.println("Desea llenar otro?\n"+"1.-Si\n"+"2.-No");
            int optc=entrada.nextInt();
            if(optc==2){
                i=comparador.length;
            }
            }
            break;
            
        case 3:
            for(int i=comparador.length-1; i>=0; i--){
                System.out.println(""+i);
                if(letra[i]!=null){
                System.out.println(""+letra[i]);
                }
            }
            
            break;
            
        case 4:
            int dowhile;
            do{
            System.out.println("Que desea elimiinar\n"+"1.-Todo\n"+"2.-Espacio");
            dowhile=entrada.nextInt();
            }while(dowhile!=1&&dowhile!=2);
            switch(dowhile){
                case 1:
                    for(int i=0; i<comparador.length; i++){
                    letra[i]=null;
                    }
                    System.out.println("Listo ;)");
                    break;
                case 2:
                    for(int i=0; i<comparador.length; i++){
                    System.out.println("Desea borrar: "+i+" Esta "+letra[i]);
                    System.out.println("1.-Si\n"+"2.-No");
                    int gato=entrada.nextInt();
                    if(gato==1){
                    letra[i]=null;
                    }
                    else{
                    }
                    }
                    System.out.println("Listo ;)");
                    break;
                default:
                    System.out.println("Ok");
            }
            break;
    
    }           
    }while(opt!=5); 
        
    }
    
}
