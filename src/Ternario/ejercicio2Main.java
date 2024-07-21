package Ternario;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio2Main {
    public static void main(String[] args) {
        ejercicio2 x = new ejercicio2();
        String pais;
        String ciudad;
        String ciudadania;
        Scanner y = new Scanner(System.in);
        System.out.println("Ingress su pais");
        pais = y.nextLine();

        System.out.println("Ingress su ciudad");
        ciudad = y.nextLine();
        ciudadania = (Objects.equals(pais, "colombia") && (Objects.equals(ciudad, "Armenia")) ? "Bienvenido Colombiano" : "Acceso denegado");
        System.out.println(ciudadania);
    }
}
