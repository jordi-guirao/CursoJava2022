
package practica5;



public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String strOriginal = "Esto es una pruena de String";	
	
		int vocales = 0; 
		int consonantes = 0; 
		
		for (int i = 0 ; i< strOriginal.length(); i++) {
			if (strOriginal.toUpperCase().charAt(i) == 'A' ||
				strOriginal.toUpperCase().charAt(i) == 'E' ||
				strOriginal.toUpperCase().charAt(i) == 'I' ||
				strOriginal.toUpperCase().charAt(i) == 'O' ||	
				strOriginal.toUpperCase().charAt(i) == 'U'  )
				
				vocales++;
			else if  (strOriginal.charAt(i)!=' ' )
				consonantes++;
		}
			
		System.out.println( "El texto tiene " + vocales + " vocales y " + consonantes + " consonantes" );
	
	}
	
}
		
		
		
		
		
		
		
