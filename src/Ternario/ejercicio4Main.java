package Ternario;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio4Main {
    public static void main(String[] args) {
        ejercicio3 x = new ejercicio3();
        String soltero;
        String sinhijos;
        String vida;
        Scanner y = new Scanner(System.in);
        System.out.println("Ingress is esta soltero o casado");
        soltero = y.nextLine();

        System.out.println("Ingress si tiene hijos o sinhijos");
        sinhijos = y.nextLine();
        vida = (Objects.equals(soltero, "soltero") && (Objects.equals(sinhijos, "sinhijos")) ? "Bienvenido soltero" : "Acceso denegado");
        System.out.println(vida);
    }
}
