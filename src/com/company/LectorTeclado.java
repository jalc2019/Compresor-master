package com.company;

import java.util.Scanner;

public class LectorTeclado {
    private Scanner scanner;
    private static LectorTeclado instance;

    public LectorTeclado(){
        scanner = new Scanner(System.in);
    }
    public static LectorTeclado getInstance(){
        if (instance == null){
            instance = new LectorTeclado();
        }
        return instance;
    }
    String leerPalabra() {
        return scanner.next();
    }
    String leeerLinea(){
        return scanner.next();
    }
    public int leerEntero(String mensaje, String reintento){
        System.out.println(mensaje);
        do {
            if (scanner.hasNextInt()){
                return scanner.nextInt();
            }
            scanner.next();
            System.out.println(reintento);
        }while (true);
    }
    public double leerFlotante (String mensaje, String reintento){
        System.out.println(mensaje);
        do {
            if(scanner.hasNextDouble()){
                return scanner.nextDouble();
            }
            scanner.next();
            System.out.println(reintento);
        }while (true);
    }
}
