package practica3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce una categoría 'a' , 'b', o 'c'  \n");
			
		Scanner sc = new Scanner(System.in);
		String strCatOriginal =sc.nextLine();
		String strCatUC= strCatOriginal.toUpperCase();
		
		switch (strCatUC){
				
			case "A":
				System.out.println("\n hijo");
				break;
			case "B":
				System.out.println("\n padres");	
				break;
			case "C":
				System.out.println("\n abuelos");	
				break;
			default:
				System.out.println("\n categoría errónea-> " + strCatOriginal);
				break;
			
		}
			sc = null;
					

	}

}
