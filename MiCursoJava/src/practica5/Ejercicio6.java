
package practica5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese una texto");
		Scanner sc = new Scanner(System.in);
		String strOriginal = sc.nextLine();	

		boolean bFound = false;
		char caracter;
		for (int i = 0 ; i< strOriginal.length(); i++) {
		
			caracter = strOriginal.charAt(i);
			if (caracter == '1'   || 
				caracter == '2'   || 
				caracter == '3'   || 
				caracter == '4'   || 
				caracter == '5'   || 
				caracter == '6'   || 
				caracter == '7'   || 
				caracter == '8'   || 
				caracter == '0'   || 
				caracter == '9'    )
					bFound = true;
			
					
		}
		
		
		if  (bFound==true)
			System.out.println("Contiene número" );
		else		
			System.out.println("No contiene número" );
		sc= null;
	}
	 
	
}
		
		
		
		
		
		
		
