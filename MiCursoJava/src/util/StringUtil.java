package util;
/**
 * 
 * @author e006720
 *
 */
public class StringUtil {
	
	public static int getCantidadDeVocales(String oCadena)
	{
		int vocales = 0; 
			for (int i = 0 ; i< oCadena.length(); i++) {
				if (oCadena.toUpperCase().charAt(i) == 'A' ||
					oCadena.toUpperCase().charAt(i) == 'E' ||
					oCadena.toUpperCase().charAt(i) == 'I' ||
					oCadena.toUpperCase().charAt(i) == 'O' ||	
					oCadena.toUpperCase().charAt(i) == 'U'  )
				vocales++;
			}
				
		return vocales;
	}

}

