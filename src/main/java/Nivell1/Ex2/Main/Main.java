package Nivell1.Ex2.Main;

import java.util.Scanner;

import static Nivell1.Ex2.Modules.ClacularDni.calcularDni;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(calcularDni(53082293));
    }
}

