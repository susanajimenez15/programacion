
//Crea un vector V numérico de 50 elementos y otro P de 20 elementos. 
//Genera luego M(50,20) de tal forma que M(I,J) es igual a V(I) * P(J)

public class Ejercicio3
{
    public static void main(String[] args)
    {
        int[] vectora = new int[50];
        int[] vectorb = new int[20];
        int[][] matriz = new int[50][20];
        
        //Dar valores a los vectores iniciales
        for(int i=0;i<vectora.length;i++){
            vectora[i]=(int)(Math.random()*5+1);
        }
        for(int i=0;i<vectorb.length;i++){
            vectorb[i]=(int)(Math.random()*5+1);
        }
        
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        
        //Calcular los valores de la matriz
        for(int i=0;i<matriz.length;i++)
        {
            for(int j=0;j<matriz[0].length;j++)
            {
                matriz[i][j]=vectora[i]+vectorb[j];
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
