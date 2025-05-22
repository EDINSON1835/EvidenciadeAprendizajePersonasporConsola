//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Persona> capturarPersonas() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese apellido:");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese género (Masculino/Femenino):");
            String genero = scanner.nextLine();
            System.out.println("Ingrese edad:");
            int edad = Integer.parseInt(scanner.nextLine());

            personas.add(new Persona(nombre, apellido, genero, edad));
        }
        return personas;
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = capturarPersonas();
    }
}
