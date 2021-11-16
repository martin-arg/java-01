package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String nombre;
    String apellido;
    String edad;
    String hobbie;
    String editorCodigo;
    String so;

    Scanner myObj = new Scanner(System.in);

    System.out.println("Ingresar el nombre");
    nombre = myObj.nextLine();

    System.out.println("Ingresar el apellido");
    apellido = myObj.nextLine();

    System.out.println("Ingresar la edad");
    edad = myObj.nextLine();

    System.out.println("ingresar el hobbie");
    hobbie = myObj.nextLine();

    System.out.println("Ingresar el editor de codigo favorito");
    editorCodigo = myObj.nextLine();

    System.out.println("Ingresar su sistema operativo favorito");
    so = myObj.nextLine();

    System.out.println("Al usuario " + nombre + " "+ apellido + " que tiene la edad de "
            + edad + " años y tiene por hobbie " + hobbie + " le gusta usar el editor de  codigo: "
            + editorCodigo + " en el sistema operativo: " + so);
    }
}
