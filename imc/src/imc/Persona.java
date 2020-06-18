//Clase Padre
package imc;

public class Persona  {
public String Nombre;
public String Sexo;
public int edad;
public double estatura;
 public double peso;
public String text,text2;
public double imc2;

    public double getImc2() {
        return imc2;
    }

    public void setImc2(double imc2) {
        this.imc2 = imc2;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void derechos(){

System.out.println("hola");
}
   public void calcular(){
   System.out.println("No hago nada soy polimorfismo");
   
   } 
}

