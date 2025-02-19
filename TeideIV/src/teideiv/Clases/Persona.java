package teideiv.Clases;

public class Persona {
	
	private String nombre;

	//Constructor
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "¡Hola! Mi nombre es " + nombre;
	}
	
	
	
	
}
