package Nivell1.Ex2.Modules;



public class ClacularDni {

    public static char [] letrasPosXValor = {'T','R','W','A','G','M','Y','F','P','D','X','B'
            ,'N','J','Z','S','Q','V','H','L','C','K','E'};

    public static String calcularDni(int dni) {
        int posLetraDni = (dni % letrasPosXValor.length);
        return String.valueOf(letrasPosXValor[posLetraDni]);
    }

    public static boolean hayLetras(String dni) {
        boolean noHayLetras = true;
        try {
            int test = Integer.parseInt(dni);
        } catch (NumberFormatException e) {
            noHayLetras = false;
        }
        return noHayLetras;
    }



    public static int pedirDni(String dni) throws NumeroIncorrectoDniException {
        int numsDni = 0;
            try {
                if (dni.length() == 8 && hayLetras(dni)) {
                    numsDni = Integer.parseInt(dni);
                } else {
                    throw new NumeroIncorrectoDniException();
                }
            } catch (NumeroIncorrectoDniException e) {
                System.out.println(e.getMessage());
            }
        return numsDni;
    }


}
