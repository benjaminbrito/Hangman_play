package com.mycompany.hangman_play.controladores;

import com.mycompany.hangman_play.tools.LeerDato;

public class Controlador {
    String palabra;
    Boolean adivino[];
    int errores = 0;
    String letra;

    public void iniciador() {
        palabraRandom();

        crearArrrayAdivino();
        while (errores < 7 && terminar()) {
            controladorImagen();
            solicitarLetra();
            while (!letraLongitud()) {
                System.out.println("Xx_Ingrese solo una letra_xX");
                solicitarLetra();
            }
            while (letraVacio()) {
                System.out.println("Xx_no se ingreseso nada_xX");
                solicitarLetra();
            }
            convertidorDeletra();
            if (verificadordeError()) {
                System.out.println("Adivinaste una letra");
                siAdivino();

            } else {
                System.out.println("Xx--No hay coincidencias--xX");
                error();
            }
        }
        
        controladorImagen();
        if (errores == 7) {
            System.out.println("Xx__PERDISTE__xX");
            System.out.print("La palabra era: " + palabra);

        } else {
            System.out.println("------GANASTE--------");
        }

    }

    public Boolean terminar() {
        for (int i = 0; i < palabra.length(); i++) {
            if (!adivino[i]) {
                return true;
            }
        }
        return false;
    }

    public void siAdivino() {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra.charAt(0)) {
                adivino[i] = true;
            }
        }
    }

    public void convertidorDeletra() {
        letra = letra.toUpperCase();
        letra = letra.trim();
    }

    public Boolean verificadordeError() {
        for (int i = 0; i < palabra.length(); i++) {
            // System.out.println(palabra.charAt(i) + "_ -" + letra.charAt(0));
            if (palabra.charAt(i) == letra.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    public void error() {
        errores++;
    }

    public void crearArrrayAdivino() {
        adivino = new Boolean[palabra.length()];
        for (int index = 0; index < adivino.length; index++) {
            adivino[index] = false;
        }
    }

    public void pintadoPalabra() {
        System.out.print("        # ");
        for (int i = 0; i < palabra.length(); i++) {
            if (!adivino[i]) {
                System.out.print("_ ");
            } else {
                System.out.print(palabra.charAt(i) + " ");
            }
        }
        System.out.println(" #");
    }

    // public void todoVerdadero() {
    //     for (int i = 0; i < adivino.length; i++) {
    //         adivino[i] = true;
    //     }
    // }

    public String palabraRandom() {
        palabra = "HOLA";
        return palabra;
    }

    public void solicitarLetra() {
        System.out.print("Ingrese una Letra: ");
        letra = LeerDato.leerDato();
    }

    public Boolean letraLongitud() {
        if (letra.length() == 1) {
            return true;
        }
        return false;
    }

    public Boolean letraVacio() {
        if (letra.isEmpty()) {
            return true;
        }
        return false;
    }

    public void controladorImagen() {
        switch (errores) {
            case 0:
                Pintadores.inicio();
                break;
            case 1:
                Pintadores.error1();
                break;
            case 2:
                Pintadores.error2();
                break;
            case 3:
                Pintadores.error3();
                break;
            case 4:
                Pintadores.error4();
                break;
            case 5:
                Pintadores.error5();
                break;

            case 6:
                Pintadores.error6();
                break;
            case 7:
                Pintadores.error7();
                break;

            default:
                break;
        }
        pintadoPalabra();
    }

    public void verificadorDeImagen() {
        System.out.println("1");
        Pintadores.error1();
        System.out.println("2");
        Pintadores.error2();
        System.out.println("3");
        Pintadores.error3();
        System.out.println("4");
        Pintadores.error4();
        System.out.println("5");
        Pintadores.error5();
        System.out.println("5");
        Pintadores.error6();
        System.out.println("7");
        Pintadores.error7();
    }
}
