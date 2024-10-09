package Nivell1.Ex3;


public class Ex3 {

    public Ex3(){}

    public static void getValorFueraDeRango() throws IndexOutOfBoundsException {
        int[] numeros = {1, 2, 3};
        int valor = 0;
        for(int num = 0; num <= numeros.length; num++){
            if (num < numeros.length) {
                valor = numeros[num];
            } else
                throw new IndexOutOfBoundsException("No existe esa posicion en la lista");
        }
    }

}
