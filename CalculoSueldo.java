//importamos la libreria para recibir datos
import java.util.Scanner;

/**
* Clase para calcular el sueldo semanal de un trabajador
* @author Hilda Raymundo
* @since 30/07/2024
*/

public class CalculoSueldo{

	/**
	* Método principal de la clase CalculoSueldo
	* @param horas Dato de las horas trabajadas por semana
	* @param pagoPorHora Dato del pago que se dará por cada hora trabajada durante la semana
	* @return sueldo Si las horas y el pago por hora ingresados son válidos
	* @version 1.0
	*/

	//Este es el metodo principal, el que se ejecuta al iniciar el programa
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);

		/**
		* @throws InputMismatchException Si las cantidades ingresadas son texto
		*/
		//Acá se lee las horas y el pago por hora ingresados
		int horas = scan.nextInt();
		double pagoPorHora = scan.nextDouble();
		
		//Acá se evalúa que la cantidad de horas sea válido
		if (horas > 168){
			//Acá se imprime un texto en caso de que las horas ingresadas no sean válidas
			System.out.println("la cantidad de horas supera las horas posibles a trabajar por semana");
		}else{
			//Acá se vuelve a evaluar si la cantidad de horas ingresadas es válido
			if (horas <= 168){
				//Acá se calcula el sueldo
				double sueldo = horas * pagoPorHora;
				//Acá se escribe el sueldo
				System.out.println(sueldo);
			}
		}
	}
}