package Ternario;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio3Main {
    public static void main(String[] args) {
        ejercicio3 x = new ejercicio3();
        String edad;
        String documento;
        String identidad;
        Scanner y = new Scanner(System.in);
        System.out.println("Ingress su edad");
        edad = y.nextLine();

        System.out.println("Ingress su documento");
        documento = y.nextLine();
        identidad = (Objects.equals(edad, "18") && (Objects.equals(documento, "cedula")) ? "Bienvenido mayor de edad" : "Acceso denegado");
        System.out.println(identidad);
    }
}
