package Nivell1.Ex2.Modules;



public class ClacularDni {

    public static char [] letrasPosXValor = {'T','R','W','A','G','M','Y','F','P','D','X','B'
            ,'N','J','Z','S','Q','V','H','L','C','K','E'};

    public static String calcularDni(int dni) {
        int posLetraDni = dni % 23;
        String letra = String.valueOf(letrasPosXValor[posLetraDni]);
        return "El DNI completo es: " + dni + letra;
    }

    public static boolean hayLetras(String dni) {
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        boolean noHayLetras = true;
            for(int num = 0; num < dni.length(); num++) {
                for(String numero : numeros) {
                    if(!(Character.toString(dni.charAt(num)).equals(numero))) {
                        noHayLetras = false;
                    }
                }
            }

        return noHayLetras;
    }



    public static int pedirDni(String dni) throws NumeroIncorrectoDniException {
        int numsDni = 0;
            try {
                if (dni.length() == 8 && !hayLetras(dni)) {
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
