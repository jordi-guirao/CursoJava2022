
package practica4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double iSueldoNeto = 0;
		System.out.println(" ");	
		System.out.println("Introduce Categoria ( A, B o C)");	
		Scanner sc = new Scanner(System.in);
		
		String strCategoria =sc.next();			
		
		String strCatUC = strCategoria.toUpperCase();
				
		System.out.println("\nCuantos años lleva en la empresa?");
		int iAntiguedad = sc.nextInt();
		
		System.out.println("\nCual es su sueldo Bruto");		
		int iSueldo = sc.nextInt();
		
		if  (iAntiguedad > 10)
			iSueldoNeto = 	iSueldo * 1.3 ;
		else if  (iAntiguedad > 5)
			iSueldoNeto =  iSueldo * 1.2 ;
		else
			iSueldoNeto = 	iSueldo * 1.1 ;
		System.out.println(iSueldoNeto);				
		
		switch (strCatUC) {
			case "A":
				iSueldoNeto += 	1000;
				break;
			case "B":
				iSueldoNeto += 	2000;
				break;
			case "C":
				iSueldoNeto += 	3000;
				break;
		}
		System.out.println("\nEl sueldo neto del trabajador es " +iSueldoNeto );	
				sc = null;
	}			
}