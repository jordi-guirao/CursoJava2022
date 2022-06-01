package practica3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese el nombre de un mes y le diré los dias que tiene \n");
	//	System.out.println("Enero , Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre");
		
		Scanner sc = new Scanner(System.in);
		String strMesOriginal =sc.nextLine();
		String strMesUC= strMesOriginal.toUpperCase();
		
		switch (strMesUC){
				
			case "ENERO":
			case "MARZO":
			case "MAYO":
			case "JULIO":
			case "AGOSTO":
			case "OCTUBRE":
			case "DICIEMBRE":
				System.out.println("\n El mes de " + strMesOriginal + " tiene 31 dias");
				break;
			case "FEBRERO":
				System.out.println("\n El mes de " + strMesOriginal + " tiene 28 dias");	
				break;
			case "ABRIL":
			case "JUNIO":
			case "SEPTIEMBRE":
			case "NOVIEMBRE":		
				System.out.println("\n El mes de " + strMesOriginal + " tiene 30 dias");	
				break;
			default:
				System.out.println("\n Estas seguro que esto que has escrito es un mes -> " + strMesOriginal);
				break;
			
		}
			sc = null;
					

	}

}
