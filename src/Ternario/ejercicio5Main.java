package Ternario;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio5Main {
    public static void main(String[] args) {
        ejercicio3 x = new ejercicio3();
        String mascotas;
        String hijos;
        String compañia;
        Scanner y = new Scanner(System.in);
        System.out.println("Ingress que mascota tiene");
        mascotas = y.nextLine();

        System.out.println("Ingress cuantos hijos tiene");
        hijos = y.nextLine();
        compañia = (Objects.equals(mascotas, "perro") && (Objects.equals(hijos, "1")) ? "Bienvenido" : "Acceso denegado");
        System.out.println(compañia);

    }
}
