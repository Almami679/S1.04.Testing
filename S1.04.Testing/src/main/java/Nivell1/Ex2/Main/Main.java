package Nivell1.Ex2.Main;

import Nivell1.Ex2.Modules.ClacularDni;
import Nivell1.Ex2.Modules.NumeroIncorrectoDniException;

import java.util.Scanner;

import static Nivell1.Ex2.Modules.ClacularDni.calcularDni;
import static Nivell1.Ex2.Modules.ClacularDni.pedirDni;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws NumeroIncorrectoDniException {

        System.out.println(calcularDni(pedirDni("53082293")));
    }
}

