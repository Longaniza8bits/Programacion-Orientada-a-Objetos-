package controltrenremake;


public class TipoVehiculo extends Vehiculo{

public void YoSoy(){
//Motos
if(NDR==2){
   if(MTR==4){
   System.out.println("Soy una Bicicleta");
   }
   else{
   System.out.println("Soy una Moticicleta");
   }   
       
}      
//Coches
else if(NDR==4){
    if(PERS==2||PERS==4){
    System.out.println("Soy un Coche");
    }
    
}
//Barcos o Trenes
else if(NDR==0){
  if(PERS>=0){
    if(MDD==2){
     System.out.println("Soy un Tren");
    }
    else{
    System.out.println("Soy un Barco");
    }
        
      
    }   
}

     
}

    
    
}
