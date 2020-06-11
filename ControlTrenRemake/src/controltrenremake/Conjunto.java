package controltrenremake;

import java.util.Scanner;

public class Conjunto {
Scanner entrada= new Scanner(System.in);
TipoVehiculo ArrayVehiculo= new TipoVehiculo();    

public void ejecucion(){
int NDP;    
boolean PAT;    
int NDR;
int FDM;
int MDD;
String MTA;
int TDV;
String CDTR;        
int PERS;
int MTR;   
System.out.println("Ingrese el Numero de Pasajeros");
NDP=entrada.nextInt();
System.out.println("Ingrese el Numero de Ruedas");
NDR=entrada.nextInt();
System.out.println("Ingrese La Fecha de Matriculacion"+" Ejemplo 300601");
FDM=entrada.nextInt();
System.out.println("Ingrese la matricula");
MTA=entrada.nextLine();
MTA=entrada.nextLine();
System.out.println("Ingrese el tiempo del viaje");
TDV=entrada.nextInt();
System.out.println("Ingrese el nombre del conductor");
CDTR=entrada.nextLine();
CDTR=entrada.nextLine();
System.out.println("Ingrese el numero de puertas\n"+
"1.-Vapor\n"+"2.-Electrico\n"+"3.-Gasolina\n"+"4.-Sin Motor\n"+"5.-Vela"
);
MTR=entrada.nextInt();
System.out.println("Medio de Desplazamiento\n"+
"1.-Terrestre\n"+"2.-Ferreo o Subterraneo\n"+"3.-Acuatico\n"
);
MDD=entrada.nextInt();

ArrayVehiculo.setNDP(NDP);
ArrayVehiculo.setNDR(NDR);
ArrayVehiculo.setFDM(FDM);
ArrayVehiculo.setMTA(MTA);
ArrayVehiculo.setTDV(TDV);
ArrayVehiculo.setCDTR(CDTR);
ArrayVehiculo.setMTR(MTR);
ArrayVehiculo.YoSoy();




}  
    


}
