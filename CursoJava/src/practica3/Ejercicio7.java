package practica3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce 3 n�meros");
			
		Scanner sc = new Scanner(System.in);
		int iNumMax = sc.nextInt();
		
		int iNumero2 = sc.nextInt();
		if ( iNumMax <  iNumero2 )
			 iNumMax = iNumero2;
	
		int iNumero3 = sc.nextInt();
		
		if ( iNumMax <  iNumero3 )
		   	 iNumMax = iNumero3;

			System.out.println("El n�mero mayor es " + iNumMax);

		sc = null;
			

	}

}
