package com.mycompany.hangman_play.controladores;

import java.util.Scanner;

public class Controlador {
    int errores = 7;

    public void verificador() {
        if (errores ==7) {
            System.out.println("Xx__PERDISTE__xX");
        }else{

        }
    }

    

    public void solicitarLetra() {
        System.out.println("Ingrese una Letra");
    }


    public static Boolean verificador(String letra) {
        if (letra.length() == 1) {
            return true;
        }
        return false;
    }

    public void controlador() {
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
