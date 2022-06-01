package practica4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número y te calculo su tabla de multiplicar");
			
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		System.out.println("Tabla de multiplicar del  " + iNum );
		System.out.println("------------------------" );
		
		for (int i = 1 ; i< 11; i++) {
			System.out.println( "   "  + iNum +  " X " + i + " = " + i * iNum);
		}


		sc = null;
			

	}

}