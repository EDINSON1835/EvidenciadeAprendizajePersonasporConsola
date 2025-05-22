// Clase persona
/* * Esta clase representa una persona con atributos como nombre, apellido, género y edad.
 * Tiene un constructor para inicializar estos atributos y métodos para obtener su valor.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

// Constructor de la clase Persona
    /* * Este constructor inicializa los atributos de la clase Persona con los valores
     * proporcionados como parámetros.
     */
    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }
// Métodos para obtener los valores de los atributos
    /* * Estos métodos devuelven el valor de los atributos de la clase Persona.
     * getNombre() devuelve el nombre, getApellido() devuelve el apellido,
     * getGenero() devuelve el género y getEdad() devuelve la edad.
     */
    public String getNombre() {
        return nombre;
    }
    // Getter para el apellido
    /* * Este método devuelve el apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }
    // Getter para el género
    /* * Este método devuelve el género de la persona.
     */
    public String getGenero() {
        return genero;
    }
    // Getter para la edad
    /* * Este método devuelve la edad de la persona.
     */
    public int getEdad() {
        return edad;
    }
}
