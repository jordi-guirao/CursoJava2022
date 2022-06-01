package practica4;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 1;
		int iSuma = 0;
		int iRandom = 0;
		int iPromedio = 0; 
		while (  iNum < 11)
		{
				iRandom = (int) (Math.random()*99+1);
				System.out.println(iRandom);
				iSuma += iRandom;
				iNum++;
				
		}
		
		iPromedio = iSuma / (iNum  - 1) ;		
		System.out.println("La suma de los números es  " + iSuma );
		System.out.println("El promedio de los números es  " + iPromedio );
	}
}


