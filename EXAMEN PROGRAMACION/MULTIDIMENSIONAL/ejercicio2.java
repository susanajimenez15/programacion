//Introduce
//una  matriz de 7 x 5  y visualízala.A continuación:
//-Crea una nueva matriz de 7 x 7 en donde las cinco primeras columnas sean las de la matriz origen
//-Guarda en la columna sexta la suma de las cinco anteriores
//-Guarda en la columna séptima la media de las cinco primeras

public class Ejercicio2
{
    public static void main(String[] args)
    {
        int[][] matriz = new int[7][5];
        
        //Crear la matriz
        for(int i=0;i<matriz.length;i++)
        {
            for(int j=0;j<matriz[0].length;j++)
            {
                matriz[i][j]=(int)(Math.random()*9);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("\n");
        
        int[][] matriz2 = new int[7][7];
        
        //Crear la matriz2
        for(int i=0;i<matriz2.length;i++)
        {
            for(int j=0;j<matriz2[0].length;j++)
            {
                if(j<5)
                {
                    matriz2[i][j]=matriz[i][j];
                    System.out.print(matriz2[i][j]+" ");
                }
                else
                {
                    matriz2[i][j]=(int)(Math.random()*9);
                    System.out.print(matriz2[i][j]+" ");
                }
                
            }
            System.out.println();
        }
        
        System.out.println("\n");
        
        //Bucle para sumar y cambiar el sexto valor
        int suma=0;
        
        for(int i=0;i<matriz2.length;i++)
        {
            suma=0;
            for(int j=0;j<5;j++)
            {
                suma+=matriz2[i][j];
            }
            matriz2[i][5]=suma;
            matriz2[i][6]=suma/6;
        }
        
        //Mostrar matriz
        for(int i=0;i<matriz2.length;i++)
        {
            for(int j=0;j<matriz2[0].length;j++)
            {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }      
        
    }
}
