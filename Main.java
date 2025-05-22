//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

// agregar codigo de la clase Persona
/**lista de personas
 * Esta clase representa una lista de personas y permite capturar, mostrar y analizar datos de ellas.
 * Se pueden capturar los datos de 5 personas, mostrar sus nombres y géneros, calcular el promedio de edad
 * y contar la cantidad de personas masculinas y femeninas.
 */
public class Main {
    private static final ArrayList<Persona> personas = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    // Método principal
    /*Este es el método principal que se ejecuta al iniciar el programa.
     * Llama a los métodos para capturar personas, mostrar nombres y géneros,
     * calcular el promedio de edad y contar la cantidad de personas masculinas y femeninas.
     */
    // agregar codigo de la clase Persona
        public static void main(String[] args) {
        capturarPersonas();
        mostrarNombresYGeneros();
        System.out.println("Promedio de edades: " + calcularPromedioEdad());
        System.out.println("Cantidad de personas masculinas: " + contarGenero("Masculino"));
        System.out.println("Cantidad de personas femeninas: " + contarGenero("Femenino"));
    }
// Capturar datos de las personas
    /*Este método captura los datos de 5 personas a través de la consola.
     * Pide al usuario que ingrese el nombre, apellido, género y edad de cada persona
     * y crea un objeto Persona con esos datos.
     */
    public static void capturarPersonas() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese los datos de la persona " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            personas.add(new Persona(nombre, apellido, genero, edad));
        }
    }
// Mostrar nombres y géneros
    /*Este método muestra en la consola los nombres y géneros de todas las personas
     * capturadas. Recorre la lista de personas y muestra el nombre y género de cada una.
     */
    public static void mostrarNombresYGeneros() {
        System.out.println("\nNombres y Géneros:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getGenero());
        }
    }
// Calcular el promedio de edad
    /*Este método calcula el promedio de edad de todas las personas capturadas.
     * Recorre la lista de personas, suma sus edades y divide por la cantidad de personas.
     */
    public static double calcularPromedioEdad() {
        int suma = 0;
        for (Persona persona : personas) {
            suma += persona.getEdad();
        }
        return (double) suma / personas.size();
    }
// Contar la cantidad de personas de un género específico
    /*Este método cuenta la cantidad de personas de un género específico (Masculino o Femenino).
     * Recorre la lista de personas y aumenta el contador si el género coincide con el buscado.
     */
    public static int contarGenero(String generoBuscado) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase(generoBuscado)) {
                contador++;
            }
        }
        return contador;
    }
}
