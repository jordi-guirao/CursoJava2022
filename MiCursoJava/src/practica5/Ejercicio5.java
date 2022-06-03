
package practica5;



public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String strOriginal = "gcasas1972@gmail.com";	
		String strNombre = "";
		String strDominio = "";
		boolean bFound = false;
		
		int iPosicion = 1;
		while ( bFound == false)
		{
			
			  if (strOriginal.charAt(iPosicion) == '@') {
				  bFound = true;
				  strNombre = strOriginal.substring(0, iPosicion); 
				  strDominio = strOriginal.substring(iPosicion + 1,  strOriginal.length()) ;
			  }
			  else				  
				 iPosicion ++;
		}
		
		System.out.println("El nombre es " + strNombre );
		System.out.println("El Dominio es " + strDominio );

	}
	
}
		
		
		
		
		
		
		
