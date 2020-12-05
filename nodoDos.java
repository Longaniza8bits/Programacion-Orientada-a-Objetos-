package nodotes;
import java.util.Scanner;
public class nodoDos {
    
    Scanner sc = new Scanner(System.in);
    
    static class Nodo {
        String dato;
        Nodo sig;
    }
    
    Nodo fin = null;

    public void agregar() {
        Nodo temp;
        System.out.println("agregar el dato ");
        if (fin == null) {
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
        } else {
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;
        }
    }

    public void mostrar() {

        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                if(actual.dato!=null){
                System.out.print(" DATO " + "[" + actual.dato + "]\n");
                };
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    
    
    public void eliminarultimo(){
      
        if (fin != null) {
            fin.dato=null;
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        nodoDos n = new nodoDos();
        do {
            System.out.println("1 add \n"
                    + "2 mostrar \n"
                    + "3 Eliminar ultimo \n"
                    + "4 salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;
              
                    case 3:
                   n.eliminarultimo();
                    break;
                    case 4:
                        break;
                    default: 
                        System.out.println("opcion invalida");
            }
        } while (opt != 4);
    }
}