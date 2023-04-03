package com.mx.condicionalesTernarcio2;
import  java.util.Scanner;
public class Programa1 {

    public static void main (String [] michelangelo){
    Scanner scanner = new Scanner(System.in);
        double calificacion1 = 0;
        double calificacion2 = 0;
        double calificacion3 = 0;
        double promedio = 0;
        System.out.println("*********** programa 1 **************");
        System.out.println("Ingrese las calificacioes ");

        calificacion1 = scanner.nextDouble();
        calificacion2 = scanner.nextDouble();
        calificacion3 = scanner.nextDouble();
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        if (!(promedio > 10)){
            if (promedio >=7){
                System.out.println("Aprobaste con "+promedio);

            }else {
                System.out.printf("Reprobado con "+promedio);
            }

        }else {
            System.out.println(" Hay un error, promedio es mayor a diez");
        }
/******************************* Ternario ************************* */
        System.out.println("****************************** Ternario ************************* ");

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double cfinal = 0;

       System.out.println("Ingrse las notas del desqueaceriado \n");
       nota1 = scanner.nextDouble();
       nota2 = scanner.nextDouble();
       nota3 = scanner.nextDouble();
       String resultado = "";
       cfinal = (nota1 + nota2 + nota3)/3;

       resultado = cfinal > 10 ? "Error"  : cfinal >= 7 ? "Aprobado, tienes "+cfinal : "Reprobado con: "+(cfinal);
       System.out.println(resultado);





    }
}
