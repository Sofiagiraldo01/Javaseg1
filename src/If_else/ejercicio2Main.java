package If_else;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class ejercicio2Main {
    public static void main(String[] args) {
        ejercicio2 x = new ejercicio2();
        String color;

        System.out.println("Adivina en que color estoy pensando");
        Scanner y = new Scanner(System.in);
        System.out.println("Ingrese un color");
        color = y.nextLine();
        if (color == "morado") {
            ;

            System.out.println("Adivinaste");
        }
            if (color != "morado") ;
            System.out.println("No adivinaste");

        }
    }












