package Variables;

import java.util.Scanner;

public class OperacionesBasicas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		// Pedimos al usuario los numeros para reralizar las operaciones
		System.out.println("Ingresa un primer numero:");
		num1 = sc.nextInt();
		
		System.out.println("Ingresa un segundo numero:");
		num2 = sc.nextInt();		
	
		System.out.println("La suma es: " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));
		System.out.println("La multiplicacion es: " + (num1 * num2));

		
	}
	
}
