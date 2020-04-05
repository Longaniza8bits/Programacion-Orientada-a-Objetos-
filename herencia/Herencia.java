/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import java.util.*;
public class Herencia {
int i;    
static String[] canela,color;
static Double[] peso,porsion;
static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        Dog[] dogs = insertDog();
        printDogsOnConsole(dogs);
        feed(dogs);
        System.out.println("After eating------------");
        printDogsOnConsole(dogs);
    }

    private static void feed(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            double weightBeforefeeding = dogs[i].getWeight();
            dogs[i].setWeight(weightBeforefeeding + 0.5);
        }
    }

    private static void printDogsOnConsole(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printToConsole();
        }
    }

    private static Dog2[] insertDog() {
        Dog2[] dogs = new Dog2[2];
        do{
        System.out.println("Meta el nombre del dogo");
        canela[i]=entrada.nextLine(); 
       System.out.println("Meta el color ");
        color[i]=entrada.nextLine();  
       System.out.println("Meta el Peso");
        peso[i]=entrada.nextDouble();
       System.out.println("Meta el porsion");
       porsion[i]=entrada.nextDouble();
        }while(i<2)         
        
        String[] names = {canela[0],canela[1]};
        String[] colours = {color[0],color[1]};
        double[] weight = {peso[0],peso[1]};
        double[] portion = {porsion[0],porsion[1]};

        for (int i = 0; i < dogs.length; i++) {
            Dog2 dog = new Dog2();
            dog.setName(names[i]);
            dog.setColour(colours[i]);
            dog.setWeight(weight[i]);
            dog.setPortion(portion[i]);
            dogs[i] = dog;
        }
        return dogs;
    }
}
