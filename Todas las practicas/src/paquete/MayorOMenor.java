package paquete;

public class MayorOMenor {

        
        int arreglo [] = {};
        int mayor=0;
        int menor=0;
        double may=0;
        double men=0;
        
        public MayorOMenor()
        {
        }
        
public int GetMayor(int array []) 
        {
		mayor = menor = array [0];
		
		for (int i = 0; i < array.length; i++) 
                {
			if(array [i] > mayor) {
				mayor = array[i];
			}
			if(array[i]<menor) {
				menor = array[i];
			}
		}
                
                return mayor;
	}
public int GetIndexOf(int array [],int dato)
{
        int index=0;

        for(int i=0; i<array.length;i ++)
        {
                if(dato==array[i])
                {
                index=i;
                break;
                }
        }

        return index;
}
public double GetMenor(double array []) 
        {
		may = men = array [0];
		
		for (int i = 0; i < array.length; i++) 
                {
			if(array [i] > may) {
				may = array[i];
			}
			if(array[i]<men) {
				men = array[i];
			}
		}
                
                return men;
	}
}