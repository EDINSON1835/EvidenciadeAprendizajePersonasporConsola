//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Persona> personas = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        capturarPersonas();
        mostrarNombresYGeneros();
        System.out.println("Promedio de edades: " + calcularPromedioEdad());
        System.out.println("Cantidad de personas masculinas: " + contarGenero("Masculino"));
        System.out.println("Cantidad de personas femeninas: " + contarGenero("Femenino"));
    }

     public static double calcularPromedioEdad() {
        int suma = 0;
        for (Persona persona : personas) {
            suma += persona.getEdad();
        }
        return (double) suma / personas.size();
    }

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
