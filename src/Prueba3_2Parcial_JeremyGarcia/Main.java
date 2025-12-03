/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba3_2Parcial_JeremyGarcia;

import java.util.Scanner;
/**
 *
 * @author jerem
 */

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n"); 
        Lista lista = new Lista();
        int opcion = 0;

        do {
            System.out.println("\n<**** MENU ****>");
             System.out.println("1. Agregar nodo");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Buscar nodo");
            System.out.println("4. Eliminar nodo");
            System.out.println("5. Ver cantidad de nodos");
            System.out.println("6. Agregar nodo en una posicion especifica");
            System.out.println("0. Salir :c");
            System.out.print("Elija una opcion: ");
            opcion = lea.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("Codigo: ");
                    int cod1 = lea.nextInt();
                    System.out.print("Nombre: ");
                    String nom1 = lea.next();
                    lista.add(new Nodo(cod1, nom1));
                    break;

                case 2:
                    System.out.println("<**** LISTA COMPLETA ****>");
                    lista.print();
                    break;

                case 3:
                    System.out.print("Codigo a buscar: ");
                    int cod3 = lea.nextInt();
                    Nodo nodo = lista.get(cod3);
                    if(nodo != null){
                        System.out.println("Nodo encontrado: " + nodo);
                    } else {
                        System.out.println("No se encontro el nodo :c.");
                    }
                    break;

                case 4:
                    System.out.print("Codigo a eliminar: ");
                    int cod4 = lea.nextInt();
                    if(lista.remove(cod4)) {
                        System.out.println("Nodo eliminado.");
                    } else {
                        System.out.println("No se encontro el nodo :c.");
                    }
                    break;

                case 5:
                    System.out.println("Cantidad de nodos: " + lista.size());
                    break;

                case 6:
                    System.out.print("Indice: ");
                    int idx = lea.nextInt();
                    System.out.print("Codigo: ");
                    int cod6 = lea.nextInt();
                    System.out.print("Nombre: ");
                    String nom6 = lea.next();
                    lista.add(idx, new Nodo(cod6, nom6));
                    break;

                case 0:
                    System.out.println("Programa finalizado (GRACIAS POR USARLO :D)");
                    break;

                default:
                    System.out.println("Error. Escoja una opcion valida pls.");
            }

        } while(opcion != 0);
    }
}

