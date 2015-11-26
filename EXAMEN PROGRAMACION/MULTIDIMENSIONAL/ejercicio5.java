//Tenemos dos matrices con la siguiente información.
//A(100,2)Nº de Producto Precio
//B (50,2)Nº de Producto Cantidad
//Tenemos que realizar el siguiente listado:
//Nº de Producto Cantidad    Precio     Importe

public class Ejercicio5
{
    public static void main(String[] args)
    {
        int[][] A = new int[100][2];
        int[][] B = new int[50][2];
        int aux=0,total=0;
        
        for (int i=0;i<A.length;i++)
        {
            A[i][0]=(int)(Math.random()*100);
            A[i][1]=(int)(Math.random()*100+1);
        }
        
        for (int i=0;i<B.length;i++)
        {
            B[i][0]=(int)(Math.random()*100);
            B[i][1]=(int)(Math.random()*10+1);
        }
        
        System.out.println("Numero\tNº del producto\tPrecio\tImporte");
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(B[i][0]==A[j][0])
                {
                    aux++;
                    
                    System.out.println(aux+".\t"+B[i][0]+"\t\t"+B[i][1]+"\t"+(B[i][1]*A[j][1])+"\t");
                    
                    total+=(B[i][1]*A[j][1]);
                    
                    j=A.length;
                }
            }
        }
        
        System.out.println("Total:\t\t\t\t"+total);
   
    }
}
