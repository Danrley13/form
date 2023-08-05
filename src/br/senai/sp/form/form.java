package br.senai.sp.form;

import java.util.Scanner;

public class form {
    public static void main(String[] args) {


        /** Importe da class Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Coleta dados do user */




        /** Printa as informações */

        System.out.println(" --------------------Formulario-------------------------\n");

        String [] nomes = new String[2];

        System.out.println(" Qual nome do prof 1: " );
        nomes[0] = teclado.next();

        System.out.println(" Qual seu nome prof 2: ");
        nomes[1] = teclado.next();


        System.out.println("________________________________________________________");

        int [] idades = new int[2];

        System.out.println("Qual sua idade prof 1: ");
        idades[0] = teclado.nextInt();

        System.out.println("Qual sua idade prof2: ");
        idades [1] = teclado.nextInt();

        System.out.println("Ola prof°s: " + nomes[0] + " e " + nomes[1] + " Sejam bem-vindos");
        System.out.println(" A idade do prof " + nomes[0] + " é " + idades[0] + " e a idade do prof " + nomes[1] + " é " + idades[1]);

        System.out.println("--------------------------BOA AULA-----------------------------");
        System.out.println("---------------------------------------------------------");


    }


}
