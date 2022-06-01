package practica4;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 1;
		int iMin =100;
		int iRandom = 0;
		int iMax = 0; 
		while ( iNum < 11)
		{
				iRandom = (int) (Math.random()*99+1);
				System.out.println(iRandom);
				
				if (iRandom > iMax)
					iMax = iRandom;
				if (iRandom < iMin)
					iMin = iRandom;
				
				iNum ++;
				
		}
					
		System.out.println("\nEl número máximo es " + iMax );
		System.out.println("El número mínimo es " + iMin );
	}
}


