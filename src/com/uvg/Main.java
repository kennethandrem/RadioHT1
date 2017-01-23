//Kenneth Martínez 16976
//Gadhi Rodriguez 16206

package com.uvg;

import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer option = 0;
        Scanner scanner = new Scanner(System.in);
        Radio radio = new Radio();
        while ( option != 5) {
            System.out.println("****************************************************");
            //System.out.println("*               " + emisora + "               *");
            System.out.println("*               " + radio.frecuency + " ----------- " + radio.station + "                 *");
            System.out.println("****************************************************");
            System.out.println("1. Subir");
            System.out.println("2. Bajar");
            System.out.println("3. Cambiar a AM");
            System.out.println("4. Emisoras Guardadas");
            System.out.println("5. Apagar radio");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    radio.Forward();
                    break;
                case 2:
                    radio.Backward();
                    break;
                case 3:
                    radio.changeFrecuency();
                    radio.station = "87.7";
                    break;
                case 4:
            }
        }
    }
}
