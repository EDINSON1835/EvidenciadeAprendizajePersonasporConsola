//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {
    ArrayList<Persona> personas = capturarPersonas();

    double promedio = calcularPromedioEdad(personas);
    System.out.println("Promedio de edad: " + promedio);
}

public static double calcularPromedioEdad(ArrayList<Persona> personas) {
    int suma = 0;
    for (Persona persona : personas) {
        suma += persona.getEdad();
    }
    return (double) suma / personas.size();
}
