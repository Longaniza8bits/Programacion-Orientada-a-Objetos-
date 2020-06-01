//Clase Padre
package imc;

public class Persona  {
 public String Nombre;
 public String Sexo;
 public int edad;
 public double estatura;
 public double peso;

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

System.out.println("que me vez joto");
}
   public void calcular(){
   System.out.println("No hago nada soy polimorfismo ctm");
   
   } 
}

