
//1.Introduce una matriz de 5 filas y 7 columnas y a continuación visualiza:
//Toda la matriz. 
//-La fila cinco completa.
//-El elemento de la cuarta fila tercera columna y el elemento de la 
//quinta  fila  tercera  columna. 
//-La primera  columna  y  la  cuarta.Intercambiar el  contenido  de estas columnas y visualizarlas  de nuevo.

public class Ejercicio1
{
    public static void main(String[] args)
    {
        int[][] matriz = new int[5][7];
        
        //Crear la matriz
        for(int i=0;i<matriz.length;i++)
        {
            for(int j=0;j<matriz[0].length;j++)
            {
                matriz[i][j]=(int)(Math.random()*9);
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //Mostrar la quinta fila
        System.out.print("[ ");
        for(int i=0;i<matriz[0].length;i++)
        {
            System.out.print(matriz[4][i]+" ");
        }
        System.out.println("]");
        
        //Mostrar elementos 
        System.out.println();
        System.out.println("Elemento fila 4 columna 3: "+matriz[3][2]);
        
        System.out.println("Elemento fila 5 columna 3: "+matriz[4][2]);
        
        //Invertir elementos
        int comodin;
        
        comodin=matriz[3][2];
        matriz[3][2]=matriz[4][2];
        matriz[4][2]=comodin;
        
        System.out.println("Elemento fila 4 columna 3: "+matriz[3][2]);
        
        System.out.println("Elemento fila 5 columna 3: "+matriz[4][2]);
        
        //Mostrar filas
        System.out.println();
        for(int i=0;i<matriz.length;i++)
        {
            System.out.println("Elemento fila "+ i +" columna 1: "+matriz[i][0]);
        }
        
        System.out.println();
        for(int i=0;i<matriz.length;i++)
        {
            System.out.println("Elemento fila "+ i +" columna 4: "+matriz[i][3]);
        }
        
        //Invertir filas y mostrar
        for(int i=0;i<matriz.length;i++)
        {
            comodin=matriz[i][0];
            matriz[i][0]=matriz[i][3];
            matriz[i][3]=comodin;
        }
        
        System.out.println();
        for(int i=0;i<matriz.length;i++)
        {
            System.out.println("Elemento fila "+ i +" columna 1: "+matriz[i][0]);
        }
        
        System.out.println();
        for(int i=0;i<matriz.length;i++)
        {
            System.out.println("Elemento fila "+ i +" columna 4: "+matriz[i][3]);
        }
       
    }
}
