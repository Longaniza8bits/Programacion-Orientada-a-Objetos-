//Codigo Modificado Por Huerta Neria Raúl

package noditos;
import java.util.Scanner;//libreria de ingreso de datos
public class nodoDos {
    
    Scanner sc = new Scanner(System.in);/*Variable para ingresar los datos, se hace en public class
   para que toda la clase tenga derecho (lo mismo se puede hacer con variables*/
    
    static class Nodo {//Declaramos nuestro Nodo, El Nodo lo podemos ver como un objeto que contiene datos
        String dato;//Dato de tipo String (Puede ser cualquiera)
        Nodo sig;  //Un Nodo extra para seguir guardando datos este contiene (String Dato y Nodo Sig) Una Paradoja
    }
    
    Nodo fin = null; //Declaramos nuestro nodo en la clase, como mencione arriba con el Scanner

    public void agregar() { //Creamos nuestro primer metodo clase
        Nodo temp;//Declaramos un Nodo llamado Temporal para causar un ciclo burbuja
        System.out.println("agregar el dato ");//pedimos agregar un dato
        if (fin == null) {//Como se menciona si fin tiene un valor null se cumplira la condicion indicada aqui
            fin = new Nodo();//Llamamos nuestra variable para poder usarla o bueno Nodo "Fin"
            fin.dato = sc.nextLine();//Aqui introducimos dentro de dato nuestro dato podemos mencionar que dato es Strgin como se muestra arriba
            fin.sig = null;//Declaramos siguiente como null, por que no queremos ingresar nada ahorita solo queriamos ingresar un dato
        } else {//Aqui se cumple la condiciones diferentes, en este caso cuando queramos agregar un segundo dato.
            temp = new Nodo();//llamamos temp que declaramos arriba para usarlo como ciclo en Nodo
            temp.dato = sc.nextLine();//Aqui agregamos nuestro nuevo Dato
            temp.sig = fin;//y aqui el Temp.sig si recordamos Sig es un Nodo guardaremos el Nodo Fin que en este caso contiene el numero
            fin = temp;//Ahora a Fin lo suplantamos con los datos que ingresamos con .dato y .sig de temp;  
        }
        /*El Bucle funciona asi, iniciamos el menu le damos a 1.- Ingresar nuestro primer dato
        Al momento de hacerlo se crea temp, y se imprime el mensaje al entrar en la condicion dice
        que si FIN esta vacio que casi siempre esta vacio al inicio, despues de cumplirse el if, se llama
        a la variable(nodo) para poder usarla y luego el scanner donde introduciremos nuestro dato en este
        caso ejemplo yo meto "martes"(puedo por que es de string) hasta ahi finaliza y si lo mostraramos
        nos enseñaria "martes" en el metodo MOSTRAR, ahora yo quiero meter otro dato enseguida le daremos
        1 nuevamente y ahora el "if" no se cumpliria pues dentro de FIN tenemos el dato en fin.sig de MARTES
        Entonces entrariasmos en el ELSE, dentro del else llamamos a nuestro Nodo TEMP para que podamos 
        ingresar dato y sustituir, temp.dato que si recordamos es STRING ingresaremos nuestro nuevo Dato en
        este caso yo ingreso "Miercoles"(Recordemos que es STRING por que es el NODO) luego en temp.sig=fin
        por que fin? para que guarde el valor que tenemos anteriormente en Fin que si recordamos es "Martes"
        Ahora mi Nodo Temp tiene como datos "Miercoles" y "Martes" ya al final el Fin=Temp es para que FIN
        que es la variable que podemos usar en todas partes tome los valores de TEMP que si recordamos 
        es MIERCOLES y MARTES y se podia representar asi. fin.dato=Miercoles fin.sig=Martes*/
        /*Asi fue el proceso dentro del programa:
        fin.dato=martes
        fin.sig=null
        temp.dato=miercoles
        temp.sig=(fin.dato=martes
        fin.sig=null)
        fin.dato=miercoles;
        fin.sig=(fin.dato=martes
        fin.sig=null);
        */
    }

    public void mostrar() {//Mi Metodo de Mostrar

        Nodo actual = new Nodo();//Declaramos otro Nodo para que este tome los valores de Fin y asi poder interactuar
        actual = fin;//Aqui le asignamos al Nodo Actual(puede llamarse como sea) los valores del Nodo Fin
        if (fin != null) {//Primer condicion explica que si fin es diferente a null haga algo, en este caso mostrar
            while (actual != null) {//Ahora para mostrar si actual diferente a null que tiene que serlo por la primer condicion de arriba
                if(actual.dato!=null){//Esta condicion es en  el caso de que borremos el ultimo y no se muestre un mensaje de null
                System.out.print(" DATO " + "[" + actual.dato + "]\n");//Imprimiremos actual.dato que es donde esta nuestra info
                };
                actual = actual.sig;//luego actual es reemplazado por sig que es el nodo para mostrar el nodo siguiente
            }
        } else {//Este es en el caso que fin no tenga ningun dato mencione que la lista se encuentra vacia
            System.out.println("\n La lista se encuentra vacia\n");//imprimimos que esta vacio
        }
        /*¿Cómo funciona?
        Es Sencillo simplemente se crea otro nodo para almacenar todos los datos, asi fin no sufrira ninguna
        modificacion y puede que no haya ningun problema, como mencionamos nosotros introducimos Martes y Miercoles
        si no hubieramos introducido nada nos mandaria al "else" pero bueno tenemos Miercoles y Martes entonces al
        cumplir la condicion pues tenemos datos entrariamos en el bucle while que mientras seamos diferentes de null 
        seguira mostrando el mensaje, lo que pasa ahora es que al haber un if en actual.dato diferente de null claro que
        se cumplira pues tenemos a Miercoles, recordemos que el Fin.dato=Miercoles y Fin.Sig= Martes y Null recordemos eso
        entonces el imprimir mostrara primero a Miercoles terminaria la impresion y en actual=actual.sig reemplazamos
        los datos que hay en actual por los de actual.sig que seria algo como actual.dato=martes actual.sig=null Recordemos
        que es un nodo, volveriamos al while que al comprobar que actual es diferente a null y actual.dato es diferente a
null pues contiene ahora a MARTES pues fue sustituido imprimira "Martes" y al cumplir actual=actual.sig= recordando
que ahora actual.sig=null; actual.dato=null, por lo tanto en while al no ser diferente de null pues ahora todos los datos estan
vacios se terminaria el ciclo y hasta ahi nos mostraria en el orden ascendente Miercoles y Martes.

/*Asi fue  dentro del codigo
    Nodo nuevo actual
        actual=fin
         actual.dato=Miercoles
        actual.sig=Martes,null
        if(fin.dato=miercoles fin.sig=Martes,null != null)
         while(actual.dato=Miercoles actual.sig=Martes,null != null)
          if(actual.dato=Miercoles != null )
            Mostrar(Miercoles);
          Actual = (Actual.sig=Martes,null)
          Actual.dato=Martes;
          Actual.sig=null;
        while(actual.dato=Martes actual.sig=null != null) //Aqui actual dato sigue teniendo un dato diferente a null por lo cual  se sigue cumplieando
        if(actual.dato=Martes != null )
            Mostrar(Martes);
        Actual = (Actual.sig=null)
          Actual.dato=null;
          Actual.sig=null;
        //rompe ciclo
        Acaba programa
        */
        
        
    }
    
    
    
    
    
    public void eliminarprimero(){//Metodo para eliminar el primer numero ingresado
     Nodo guardado = new Nodo();
     Nodo Manejo = new Nodo();
     guardado=fin;
     while(fin != null){
     
         System.out.println("Este es : "+fin.dato);
         
         if(fin.sig==null){
         fin.dato=null;
         }
   fin=fin.sig;
   Manejo=fin;    
     }
System.out.println("Termine :"+fin.dato);
        
        
    }
    public void eliminarultimo(){//Metodo para eliminar el ultimo metodo ingresado, y en caso de ingresar solo un dato elimina el unico
      
        if (fin != null) {// Comprobamos que fin no este vacio
            fin.dato=null;// en este caso el ultimo en ingresar sera eliminado recordemos que se guardo en temp.dato que es lo mismo que fin.dato
        } 
    }   /*¿Cómo funciona?
        El codigo elimina el ultimo nodo pues recordemos que lo ultimo que es ingresado por la condicion que se encuentra
    en el metodo AGREGAR se guarda dentro de temp.dato que es lo mismo que fin.dato por lo tanto nosotros lo ultimo en ingresar
    fue Miercoles asi que este se guardo en Fin.dato=dato, asi que lo convertimos en null*/
    
     /*Como se ve en el codigo
      si(fin.dato=Miercoles fin.sig=martes,null != null)
        fin.dato=null // se convierte en nulo
    */  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Declaramos de nuevo un Scanner, pues los objetos que no son de tipo static o variabes no pueden ser utilizados en la main
        int opt = 0;//iniciamos nuestra variable para introducir nuestras opciones
        String dato;//Variable innecesaria que dejo el profesor
        nodoDos n = new nodoDos();//llamamos nuestro objeto para asi poder llamar a nuestros  metodos recordemos que NodoDos es todo nuestro objeto
        do {//iniciamos do while para que podamos hacer multi accionnes
            System.out.println("1 add \n"
                    + "2 mostrar \n"
                    + "3 Eliminar primero \n"
                    + "4 Eliminar ultimo \n"
                    + "5 salir");//le mostramos nuestro menu al individuo
            switch (opt = sc.nextInt()) {// iniciamos nuestro switch donde iran nuestras opciones de nuestro menu
                case 1:// aqui agregaremos
                    n.agregar(); //llamamos nuestro objeto n (que recordemos es esta clase) acompañada de un punto y el nombre del metodo es para agregar
                    break;// cerramos el caso

                case 2://aqui se hara lo de mostrar
                    n.mostrar();//Llamamos nuestro objeto n que recordamos y el nombre de la clase en este caso es para Mostrar
                    break;//cerramos el caso
                case 3://aqui eliminara el primero
                    n.eliminarprimero();//Llamamos nuestro objeto n que recordamos y el nombre de la clase en este caso es para eliminar primero
                    break;//cerramos el caso
                    case 4://aqui eliminaremos el ultimo
                   n.eliminarultimo();//Llamamos nuestro objeto n que recordamos y el nombre de la clase en este caso es para eliminar el ultimo
                    break;//Cerramos nuestro caso
                    default://este se selecciona por defecto si no cumple una condicion numerica aunque tambien pueden ser STRING,FLOAT,CHAR,ETC
                        System.out.println("Invalido");//Decimos que es una opcion invalida
                        
            }
        } while (opt != 5);//Aqui continua nuestro Do-While con la condicion de que si OPT es diferente a 5 se siga repitiendo si notamos la unica forma de terminarlo es precionando 5
    }
}
//Terminamos felicidades
//Escrito completo por Huerta Neria Raúl