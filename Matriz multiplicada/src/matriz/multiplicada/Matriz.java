package matriz.multiplicada;

public class Matriz {
 int matriz[][]=new int[11][11];
 int valor=0;
 int h=0,k=0;
public void matriz(){ 
 //Vertical Arriba-Abajo
 matriz[0][0]=0;   
 matriz[1][0]=1;
 matriz[2][0]=2;
 matriz[3][0]=3;
 matriz[4][0]=4;
 matriz[5][0]=5;
 matriz[6][0]=6;
 matriz[7][0]=7;
 matriz[8][0]=8;
 matriz[9][0]=9;
 matriz[10][0]=10;
 //Horizontal Derecha-Izquierda
 matriz[0][1]=1;   
 matriz[0][2]=2;
 matriz[0][3]=3;
 matriz[0][4]=4;
 matriz[0][5]=5;
 matriz[0][6]=6;
 matriz[0][7]=7;
 matriz[0][8]=8;
 matriz[0][9]=9;
 matriz[0][10]=10;
 //vertical
 for(int i=0;i<matriz.length;i++){
 //horizontal
 h++;
 for(int j=1;j<matriz.length;j++)
 {
 k=j;
 
 matriz[i][j]=matriz[i][j]*matriz[h][k];    
     
     
 }
 
 
 
 }
 
 

 
 }
public void imprimir(){
for(int i=0;i<matriz.length;i++){
 
 for(int j=0;j<matriz.length;j++)
 {
 System.out.printf(" "+matriz[i][j]+" ");
 
 } 
 System.out.println("");
 }
    
    
}
 }
 
 
 
 
   
    
    

