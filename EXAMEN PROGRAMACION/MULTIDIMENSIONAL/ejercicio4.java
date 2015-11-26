//Generar  en  cuadrado  Latino  de  orden  N.  (Un  cuadrado  Latino  de 
//orden N es una matriz cuadrada en la que la primera fila contiene los N 
//primeros  números  naturales,  en  orden,  y  cada  una  de las  siguientes 
//filas contiene la rotación de la fila anterior un lugar a la derecha

import java.util.*;

public class Ejercicio4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int N = scan.nextInt();
        
        int[][] matrizlatina = new int[N][N];
        int num=2;
        
        matrizlatina[0][0]=1;
        
        for(int i=0;i<matrizlatina.length;i++){
            for(int j=0;j<matrizlatina[0].length;j++){
                
                if(j==0 && i!=0){
                    matrizlatina[i][j]=matrizlatina[i-1][matrizlatina.length-1];    
                }
                
                if (j!=0){
                    matrizlatina[i][j]=num;
                    num++;
                }
                
                if (num==N+1) 
		   num=1;
                
                System.out.print(matrizlatina[i][j]+"\t");
            }
            System.out.println();
        }
        
        
        
  
