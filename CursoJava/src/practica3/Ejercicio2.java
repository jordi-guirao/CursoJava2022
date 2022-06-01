package practica3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		System.out.println("Ingrese un numero y adivinaré si es par o impar");
		Scanner sc = new Scanner(System.in);
		int iNumero = sc.nextInt();
		
		if (iNumero%2==0)
			System.out.println("El número introducido es par");
		else
			System.out.println("El número introducido es impar");
		sc = null;
					
	}

}



