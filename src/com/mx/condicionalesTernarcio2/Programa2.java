package com.mx.condicionalesTernarcio2;
import java.util.Scanner;
public class Programa2 {

    public static void main(String [] michelangelo) {
    Scanner scanner = new Scanner (System.in);
        String user1 = "";


       int opcion = 0;

        System.out.println("Menu\n 1)Ingresar Usuario \n 2) Borar usuario ");
        opcion = scanner.nextInt();
        scanner.nextLine();
        if ( opcion <= 2 && opcion >= 0){

            if ( opcion == 1){
                System.out.println("Ingrese al usuario : ");
                user1 = scanner.nextLine();
                System.out.println("El usuario es "+user1);
            } else if (opcion == 2) {
                user1 = "";
                System.out.println("Se booro el usuario");

            }
        }else {
            System.out.println("Opcion invalida");
        }


        System.out.println("*************** el ternario ***************************");

        System.out.println("Menu\n 1)Ingresar Usuario \n 2) Borar usuario ");
        opcion = scanner.nextInt();
        scanner.nextLine();
        System.out.println (
                            opcion >=0 && opcion <=2 ? opcion == 1 ? "Ingrese un usuario"  : "Usted lo elimino"   : "hay un error"
                            );




    }




}
