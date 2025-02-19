package teideiv.Logica;

import java.util.Scanner;

import teideiv.Clases.Persona;

public class mainPersona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona[] personas = new Persona[3];
		
		for(int i = 0; i < personas.length; i++) {
			System.out.println("Ingresa el nombre de la persona " + (i + 1));
			String nombre = sc.nextLine();
			personas[i] = new Persona(nombre);
			
		}
		
		System.out.println("\nLista de personas:");
		
		for(Persona persona : personas) {
			System.out.println(persona);
		}
		
	}

}
