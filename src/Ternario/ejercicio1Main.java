package Ternario;

import java.util.Objects;
import java.util.Scanner;

public class ejercicio1Main {
    public static void main(String[] args) {
        ejercicio1 x =new ejercicio1();
        String nombre;
        String apellido;
        String estado;
        Scanner y = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = y.nextLine();

        System.out.println("Ingrese su apellido");
        apellido = y.nextLine();
        estado = (Objects.equals(nombre, "Sofía")&& (Objects.equals(apellido, "Giraldo Gonzalez"))? "Bienvenido,Sofía" : "Acceso denegado");
        System.out.println(estado);
    }

}
