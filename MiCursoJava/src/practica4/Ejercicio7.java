
package practica4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double iSueldoNeto = 0;
		
		int iCatRandom = 0;
		int iAntiguedadRandom = 0;
		int iSueldoRandom = 0;
		int iNum = 1;
		char cCat= 'A';
		while (iNum < 11)
		{
				iAntiguedadRandom = (int) (Math.random()*20+1);
				iSueldoRandom = (int) (Math.random()*28000+15000);
				iCatRandom = (int) (Math.random()*3+1);
				
				//System.out.println("Sueldo Bruto" + iSueldoRandom + "Categoria" + iCatRandom + "Antiguedad" + iAntiguedadRandom );
				
				
				switch (iCatRandom) {
				case 1:
					// categoria "A"
					iSueldoNeto += 	1000;
					cCat = 'A';
					break;
				case 2:
					iSueldoNeto += 	2000;
					cCat = 'B';
					break;
				case 3:
					iSueldoNeto += 	3000;
					cCat = 'C';
					break;
				}
					
				System.out.println("Sueldo Bruto: " + iSueldoRandom + " / Categoria: " + cCat + " / Antiguedad: " +iAntiguedadRandom + " >>>>> Sueldo Neto : " + iSueldoNeto );
				iNum++;
				
		}
		
	}
	
}
		
		
		
		
		
		
		
