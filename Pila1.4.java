package pila;

import java.util.Scanner;
import java.util.Random;

public class Pila {    
    public static void main(String[] args) {
        Random random=new Random();
    Scanner entrada=new Scanner(System.in); //Scanner de entrada
  int pilatamano=26,opt; //Variable del tamaño de la pila y las opciones para el switch
  String letra[]=new String[pilatamano]; //String innecesario para almacenar el abecedario o otra palabra
  String conversor[]=new String[pilatamano]; //El Encargado de ser el convertidor
    char comparador[]=new char[pilatamano]; //El Encargado de leer el ascii
    char abe=65; //Meter el abecedario con codigo Ascii
     int ArrayInt[]=new int[pilatamano];//Libreria para almacenar numero 
     int Ordenador[]=new int[pilatamano];//Ordenador encargado de almacenar la numeracion para poder acomodarlo
      char caracteres[]=new char[pilatamano];//de Recibir y transformar el string a char
     do{  
    System.out.println("Bienvenido Pila abecedario,¿Qué desea hacer?\n"
            +"1.-AutoLlenado\n"+
            "2.-Llenado selectivo\n"
            +"3.-Mostra\n"+
            "4.-Eliminar\n"
            +"5.-Salir\n"
            +"6.-AutoLlenado Al Azar\n"
            +"7.-Ordenado"
            ); //Opciones
            opt=entrada.nextInt();
    switch(opt){
        case 1:  //Primera opcion
        for(int i=0; i<comparador.length; i++){
            //El If y else funcionan para separar los slot ya llenos y que el auto llenado no lo ocupe
            //Tambien se salta las letras faltantes o el slot donde se lleno se lo salta ejemplo
            //abc norma y si meto yo algo seria: JKC la c continua solo introduje jk
           if(letra[i]==null){
        comparador[i]=abe;//Entrada de Ascii
        conversor[i]=Character.toString(comparador[i]);//Convirtiendo char a string
        letra[i]=conversor[i];//asignando a la letra el valor del convertido
        abe++;//seguir en la tabla de Ascii
           }
           else{
           i++;//La condicion para saltarselo
           }
        }
    
        break;
        case 2: //Opcion 2 encargada de hacer el llenado manual en un slot de forma progresiva
            for(int i=0; i<comparador.length; i++){ //ciclo para ir renglon
            System.out.println("Llenar el renglon:"+i);
            letra[i]=entrada.next(); //Llenar el renglon que se te menciona o bueno la pila
            System.out.println("Desea llenar otro?\n"+"1.-Si\n"+"2.-No"); //Si deseas seguir llenando o no
            int optc=entrada.nextInt();
            if(optc==2){
                i=comparador.length; //Si no deseas esto terminara el for
            }
            }
            break;
            
        case 3://Caso 3 encargado de ordenar la pila del primero que ingresa es el ultimo en salir
            int h=1;
            for(int i=0; i<comparador.length; i++){
                if(h==comparador.length){
                   h=comparador.length-2;
      
                }
              if(comparador[i]==comparador[h]){
    
               comparador[i]=0;
               letra[i]=Character.toString(comparador[i]);
              }
              else{
           
              }
            h++;
            }
            
            
            
            for(int i=comparador.length-1; i>=0; i--){ 
               
               if(letra[i]!=null&&comparador[i]!=0){//condicion si no hay nada lleno no se mostrara
                 System.out.print(" "+letra[i]);   
             
  
                }
               
                if(i==0){
                    System.out.println("");
                }
                
            }
            
            break;
            
        case 4://Caso 4 encargado de eliminar un dato o fragmento de la pila
            int dowhile;//Variable para poder seleccionar una eliminacion
            do{
            System.out.println("Que desea elimiinar\n"+"1.-Todo\n"+"2.-Espacio\n"+"3.-Nada");
            dowhile=entrada.nextInt();
            }while(dowhile!=1&&dowhile!=2);//Ciclo encargado de poner una opcion
            switch(dowhile){
                case 1://Este se encarga de borrar todo
                    for(int i=0; i<comparador.length; i++){
                    letra[i]=null;
                    }
                    System.out.println("Listo ;)");
                    break;
                case 2://Este se encarga de borrar el slot que desees mirando uno por uno
                    for(int i=0; i<comparador.length; i++){
                    System.out.println("Desea borrar: "+i+" Esta "+letra[i]);
                    System.out.println("1.-Si\n"+"2.-No");
                    int gato=entrada.nextInt();
                    if(gato==1){
                    letra[i]=null;
                    }
                    else{
                    }//Condicion por si desea seguir borrando o ya no
                    }
                    System.out.println("Listo ;)");
                    break;    
                    
                default:
                    System.out.println("Ok");
            }
        case 6:
            
             for(int i=0; i<comparador.length; i++){
            //El If y else funcionan para separar los slot ya llenos y que el auto llenado no lo ocupe
            //Tambien se salta las letras faltantes o el slot donde se lleno se lo salta ejemplo
            //abc norma y si meto yo algo seria: JKC la c continua solo introduje jk
           if(letra[i]==null){
               
              ArrayInt[i]=random.nextInt(90-65+1)+65; //Llenado de numeros aleatorios del numero 65 a 90
              //Orden para esto es (Mayor Numero - Menor Numero+1)+Menor Numero
        comparador[i]=(char)ArrayInt[i];//Entrada de los numeros aleatorios para su llenado
        conversor[i]=Character.toString(comparador[i]);//Convirtiendo char a string
        letra[i]=conversor[i];//asignando a la letra el valor del convertido
           }
           else{
           i++;//La condicion para saltarselo
           }
        }
            
            
            break;
    
        case 7:
            //Caso Encargado de Ordenar
            for(int i=0; i<Ordenador.length; i++){
            caracteres[i]=letra[i].charAt(0);//Transformar todos las letras en numeracion para usar un orden
            Ordenador[i]=caracteres[i];//Transformamos los caracteres enteros
            } //Encargado de Obtener todos los datos para poder ordenarlos
           for(int i=0;i<Ordenador.length;i++){
  for(int j=i+1;j<Ordenador.length;j++){
   if(Ordenador[i]>Ordenador[j])
   {
   int aux=Ordenador[j];//Guardamos el valor menor
    Ordenador[j]=Ordenador[i];//Guardamos el Valor mayor en J
    Ordenador[i]=aux;//Convertimos el Valor Mayor en Menor
   }      
  }
}//Encargador de Ordenador de Menor a Mayor
           for(int z=0; z<Ordenador.length; z++){
               comparador[z]=(char)Ordenador[z];//Convertimos lo ordenador en char
               conversor[z]=Character.toString(comparador[z]);//Convertimos el char en string ya en Ascii
               letra[z]=conversor[z];//Almacenamos la letra
           }
   
           
           
           
           
 
            
            break;
            
    }           
    }while(opt!=5); //Ciclo de repeticion hasta que termine
        
    }
    
}
