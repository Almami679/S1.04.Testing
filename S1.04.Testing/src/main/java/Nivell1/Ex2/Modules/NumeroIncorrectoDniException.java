package Nivell1.Ex2.Modules;

public class NumeroIncorrectoDniException extends Exception {

    public NumeroIncorrectoDniException() {}

    @Override
    public String getMessage() {
        return "El numero introducido no concuerda con un formato real de DNI";
    }
}
