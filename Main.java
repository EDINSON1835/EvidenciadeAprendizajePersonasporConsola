//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Persona> personas = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

// Metodo principal
    /**
     * Este es el método principal que se ejecuta al iniciar el programa.
     * Se encarga de capturar los datos de las personas, mostrar sus nombres y géneros,
     * calcular el promedio de edad y contar la cantidad de personas masculinas y femeninas.
     .*/
    public static void main(String[] args) {
        capturarPersonas();
        mostrarNombresYGeneros();
        System.out.println("Promedio de edades: " + calcularPromedioEdad());
        System.out.println("Cantidad de personas masculinas: " + contarGenero("Masculino"));
        System.out.println("Cantidad de personas femeninas: " + contarGenero("Femenino"));
    }
// Metodo para capturar los datos de las personas
    /* Este método captura los datos de 5 personas (nombre, apellido, género y edad)
     * y los almacena en una lista de objetos Persona.
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
// Metodo para mostrar los nombres y generos
    /*Este método muestra en consola los nombres y géneros de las personas capturadas.
     */
    public static void mostrarNombresYGeneros() {
        System.out.println("\nNombres y Géneros:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getGenero());
        }
    }
// Metodo para calcular el promedio de edad
    /* Este método calcula el promedio de edad de las personas capturadas.
     * Se suma la edad de cada persona y se divide por la cantidad total de personas.
     */
    public static double calcularPromedioEdad() {
        int suma = 0;
        for (Persona persona : personas) {
            suma += persona.getEdad();
        }
        return (double) suma / personas.size();
    }
// Metodo para contar la cantidad de personas de un genero especifico
    /* Este método cuenta la cantidad de personas de un género específico (Masculino/Femenino).
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

