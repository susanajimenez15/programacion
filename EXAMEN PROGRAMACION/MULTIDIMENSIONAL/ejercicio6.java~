//6.Crea un programa paragestionar las notas de un grupoescolar.
//Elgrupo se compone de 20alumnos y tiene3 módulos.
//-Calcular la nota media de cadaalumno
//-Calcular la máxima nota de cada módulo
//-Calcular la nota media por módulo y cuantosalumnos la sobrepas

public class Ejercicio6
{
    public static void main(String[] args)
    {
        int[][] matriz = new int[20][4];
        int[] max = {0,0,0};
        int[] media = {0,0,0};
        int[] sobre = {0,0,0};
        
        for(int i=0;i<matriz.length;i++)
        {
            for(int j=0;j<matriz[0].length;j++)
            {
                matriz[i][j]=(int)(Math.random()*10);
                if(j==3) matriz[i][j]=(matriz[i][0]+matriz[i][1]+matriz[i][2])/3;
                //System.out.print(matriz[i][j]+"\t");
                if (j<3 && matriz[i][j]>max[j]) max[j]=matriz[i][j];
                if(j<3) media[j]+=matriz[i][j];
            }
            //System.out.println();
        }
        
        for(int i=0;i<media.length;i++)
        {
            media[i]=media[i]/20;
        }
        
        for(int i=0;i<media.length;i++)
        {
            for(int j=0;j<matriz.length;j++)
            {
                if(matriz[j][i]>media[i]) sobre[i]++;
            }
        }
        
        System.out.println("Alumno\tNota Modulo 1\tNota Modulo 2\tNota Modulo 3\tMedia");
        
        for(int i=0;i<matriz.length;i++)
        {
            System.out.print((i+1)+"\t");
            for(int j=0;j<matriz[0].length;j++)
            {
                System.out.print(matriz[i][j]+"\t\t");
            }
            System.out.println();
        }
        
        System.out.print("Media\t");
        for(int i=0;i<media.length;i++)
        {
            System.out.print(media[i]+"\t\t");
        }
        
        System.out.println("\n\n");
        for(int i=0;i<media.length;i++)
        {
            System.out.println("Sobresalen "+sobre[i]+" en el Modulo "+(i+1));
        }
        
        System.out.println("\n\n");
        
    }
}
