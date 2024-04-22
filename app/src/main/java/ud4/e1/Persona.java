package ud4.e1;

/**
 * Clase que define los metodos y atributos de una persona.
 */

public class Persona {

	/**
	 * Nombre: El nombre de una persona 
	 */
    private String nombre;
    /**
     * Edad: la edad de una persona
     */
    private int edad;

    /**
     * El constructor básico con todos los campos de un objeto persona.
     * @param nombre el nombre de una persona
     * @param edad  la edad de una persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo para obtener el campo {@link Persona#nombre nombre} de una persona
     * @return String El nombre del objeto persona desde donde se invoca el método
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para definir el nombre de una persona.
     * @param nombre El nombre que se le colocará a la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el campo {@link Persona#edad edad} de una persona.
     * @return edad Entero que representa la edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo para definir el campo edad de una persona.
     * @param edad La edad que se le dará a dicha persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para imprimir los detalles de una persona. Imprime el nombre y la edad de dicha persona.
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
