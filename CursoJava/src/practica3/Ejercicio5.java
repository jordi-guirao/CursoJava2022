package practica3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce la posición en la que has terminado:");
			
		Scanner sc = new Scanner(System.in);
		int iNumero = sc.nextInt();
		
		
		switch (iNumero){
				
			case 1:
				System.out.println("\n Enhorabuena, has ganado la medalla de Oro");
				break;
			case 2:
				System.out.println("\n Enhorabuena, has ganado la medalla de Plata");	
				break;
			case 3:
				System.out.println("\n Enhorabuena, has ganado la medalla de Bronce");	
				break;
			default:
				System.out.println("\n Gracias por participar, mas suerte la próxima vez");
				break;
			
		}
			sc = null;
					

	}

}
