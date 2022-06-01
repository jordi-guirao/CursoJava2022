package practica3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce el curso en el que está el alumno");
			
		Scanner sc = new Scanner(System.in);
		int iCurso = sc.nextInt();
		
		if (iCurso  == 0)
			
			System.out.println("El alumno está en jardín de infantes");
		else if	 (	iCurso  == 1 ||   
					iCurso  == 2 ||
					iCurso  == 3 ||
					iCurso  == 4 ||			
					iCurso  == 5 ||
					iCurso  == 6   )
			System.out.println("El alumno está en Primaria");
		else if	 (	iCurso  == 7  ||   
					iCurso  == 8  ||
					iCurso  == 9  ||
					iCurso  == 10 ||			
					iCurso  == 11 ||
					iCurso  == 12   )
			System.out.println("El alumno está en Secundaria");
		sc = null;
			

	}

}
