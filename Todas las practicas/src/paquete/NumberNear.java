package paquete;

/**
 *
 * @author Luis
 */
public class NumberNear 
{
    public static float masCercano(float[] numeros, float num) {
        float cercano = 0;
        float diferencia = Float.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                return numeros[i];
            } else {
                if(Math.abs(numeros[i]-num)<diferencia){
                    cercano=numeros[i];
                    diferencia = Math.abs(numeros[i]-num);
                }
            }
        }
        return cercano;
    }
    
    public static int GetIndexOf(float[] numeros, float num)
    {
                        for(int i=0;i<numeros.length;i++)
                        {
                            if(numeros[i]==num)
                            {
                            return i;
                            }
                        }
                        
                        return -1;
    }
    
    public static int contar0(float[][] nums)
    {
        int numero=0;
  
        for(int i=0;i<nums.length;i++)
        {
        if(nums[i][0]==0)
            {
              numero=numero+1;
            }
        }
        return numero;
    }
    
    public static float[][] quitar0(float[][] nums,int f)
    {
    float[][] valores= new float[f][2];
                int a=0;
                for(int i=0;i<nums.length;i++)
                {
                   if(nums[i][0]!=0)
                   {
                       valores[a][0]=nums[i][0];
                       valores[a][1]=nums[i][1];
                       a=a+1;
                   }
                }
    
    return valores;
    }
    
    public static int GetClass(float[][] nums, int lim)
    {
        int clase=0;
        float mayor,menor; 
        if(lim==1)
        {
         return (int)nums[0][1];
        }
        else
        {
            mayor=menor=nums[0][0];
            for(int i=0;i<lim;i++)
            {
                if (nums[i][0] > mayor) mayor = nums[i][0];
		if (nums[i][0] < menor) menor = nums[i][0];
            }
            
            for(int i=0;i<lim;i++)
            {
                if(nums[i][0]==mayor)
                {
                clase=(int)nums[i][1];
                break;
                }
            }
        }
        return clase;
    }
}
