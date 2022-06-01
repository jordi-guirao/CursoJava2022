package practica4;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int iNum = 1 ; iNum <11 ; iNum++) {
			
			System.out.println("Tabla de multiplicar del  " + iNum );
			System.out.println("------------------------" );

			for (int i = 1 ; i< 11; i++) {
				System.out.println( "   "  + iNum +  " X " + i + " = " + i * iNum);
			}
			System.out.println("\n " );

		}
		

	}

}

