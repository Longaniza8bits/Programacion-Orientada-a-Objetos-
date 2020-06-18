//Clase Hija
package imc;

//Herencia de Persona a Calcular.
public class Calcular extends Persona {
//Variable
double cuadrado;    
double imc;    


public void calcular(){
//Cuadrado del Estatura    
cuadrado=Math.pow(estatura, 2); 
//Calculo IMC
imc=peso/cuadrado;
imc2=imc;
//Imprimo sus datos.
text=("Nombre: \n"+Nombre+"  \n"+
"Genero: \n"+Sexo+"  \n"+
"Edad: \n"+edad+"   \n"+
"Peso: \n"+peso+"   \n"+
"Estatura: \n"+estatura+"   \n"+
"IMC: \n"+imc);
//Condicion por la tabla IMC
if(imc<18.50)
{
if(imc<16.00)
{
text2=("Usted tiene Delgadez Severa");
}
else if(imc>=16.00&&imc<=16.99)
{
text2=("Usted tiene Delgadez Moderada");
}
else if(imc>=17.00&&imc<=18.49)
{
text2=("Usted tiene Delgadez Moderada");
}
}
else if(imc>=18.50&&imc<=24.99)
{
text2=("Usted tiene un peso ideal");
}
else if(imc>=25.00)
{

if(imc>=25.00&&imc<30.00){
text2=("Usted tiene Pre obesidad");
}
else if(imc>=30.00&&imc<=34.99){
System.out.println("Usted tiene un Obesidad tipo 1");
}
else if(imc>=35.00&&imc<=39.99){
text2=("Usted tiene un Obesidad tipo 2");
}
else if(imc>=40.00){
text2=("Usted tiene un Obesidad tipo 3");
}


}

}    

    
    
    
}
