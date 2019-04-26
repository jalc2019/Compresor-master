package com.company;


public class Menu {

    public int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("--MENU PRINCIPAL--");
        System.out.println("1. Comprimir con archivos ");
        System.out.println("2. Comprimir texto");
        System.out.println("3. Descomprimir texto");
        System.out.println("4. Ver los Archivos disponibles");
        System.out.println("5. Exit");

        int opcion = 0;

        while((opcion <1)|| (opcion>6)){
            LectorTeclado lt = new LectorTeclado();
            opcion = lt.leerEntero("Favor Ingrese una opcion","Intente de nuevo");

            if ((opcion<1)||(opcion>6)){
                System.out.println("Opcion nula");
            }
        }
        return opcion;
    }
}
