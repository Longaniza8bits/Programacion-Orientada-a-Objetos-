package controltrenremake;


public class Vehiculo {
 /*
 Variables
Numero de Pasajeros      NDP
Presencia o Ausencia de tripulacion PAT
Numero de ruedas NDR
Fecha de matriculacion FDM
Matricula completa MTA    
Medio de desplazamiento MDD
Tiempo del viaje TDV
Conductor CDTR
Puertas PERS
Motor MTR
*/ 
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

    public int getMDD() {
        return MDD;
    }

    public void setMDD(int MDD) {
        this.MDD = MDD;
    }

    public int getNDP() {
        return NDP;
    }

    public void setNDP(int NDP) {
        this.NDP = NDP;
    }

    public boolean isPAT() {
        return PAT;
    }

    public void setPAT(boolean PAT) {
        this.PAT = PAT;
    }

    public int getNDR() {
        return NDR;
    }

    public void setNDR(int NDR) {
        this.NDR = NDR;
    }

    public int getFDM() {
        return FDM;
    }

    public void setFDM(int FDM) {
        this.FDM = FDM;
    }

    public String getMTA() {
        return MTA;
    }

    public void setMTA(String MTA) {
        this.MTA = MTA;
    }

    public int getTDV() {
        return TDV;
    }

    public void setTDV(int TDV) {
        this.TDV = TDV;
    }

    public String getCDTR() {
        return CDTR;
    }

    public void setCDTR(String CDTR) {
        this.CDTR = CDTR;
    }

    public int getPERS() {
        return PERS;
    }

    public void setPERS(int PERS) {
        this.PERS = PERS;
    }

    public int getMTR() {
        return MTR;
    }

    public void setMTR(int MTR) {
        this.MTR = MTR;
    }


 public void YoSoy(){
     
  System.out.println("A un no se que soy");   
     
}
 
 public void Horario(){
 
if(NDP>0){
System.out.println("Su Vehiculo se Aproxima\n"+
"Se Aproxima con"+NDP+"Pasajeros\n"+        
"Su Matricula es\n"+MTA+
"Su Conductor sera \n"+CDTR+ 
"Tendra un Viaje Aproximado de "+TDV+"Minutos\n"+
 "");

}     
     
else    
System.out.println("Su Vehiculo se Aproxima\n"+
"Vacio"+        
"Su Matricula es\n"+MTA+
"Su Conductor sera \n"+CDTR+ 
"Tendra un Viaje Aproximado de "+TDV+"Minutos\n"+
 "");
     
     
     
 }
 
 





    
}
