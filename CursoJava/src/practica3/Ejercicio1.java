package practica3;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("Ingrese 3 notas para evaluar alumno");
		Scanner sc = new Scanner(System.in);
		int iEvaluacion = sc.nextInt();
		iEvaluacion += sc.nextInt();
		iEvaluacion += sc.nextInt();
		iEvaluacion /= 3;		 
		
		if (iEvaluacion >= 7   )
			System.out.println("Aprobado con: " + iEvaluacion);
		else
			System.out.println("Reprobado con: " + iEvaluacion);
		sc = null;
					
	}

}
