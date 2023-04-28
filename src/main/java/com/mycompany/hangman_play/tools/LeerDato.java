package com.mycompany.hangman_play.tools;

import java.util.Scanner;

public class LeerDato {
    
    public static String leerDato() {
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.nextLine();
        return letra;
    }
}
