package com.mx.condicionalesTernarcio2;
import java.util.Scanner;
public class Programa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrse el mes");
        int mes =scanner.nextInt();

        if (mes >0 & mes <=12 ){

            if (mes == 1){
                System.out.println("El mes es de Enero");
            }else if (mes == 2){
                System.out.println("El mes es de Febrero");
            } else if (mes==3) {
                System.out.println("El mes es de Marzo");
            }else if (mes==4) {
                System.out.println("El mes es de Abril");
            }else if (mes==5) {
                System.out.println("El mes es de Mayo");
            }else if (mes==6) {
                System.out.println("El mes es de Junio");
            }else if (mes==7) {
                System.out.println("El mes es de Julio");
            }else if (mes==8) {
                System.out.println("El mes es de Agosto");
            }else if (mes==9) {
                System.out.println("El mes es de Septiembre");
            }else if (mes==10) {
                System.out.println("El mes es de Octubre");
            }else if (mes==11) {
                System.out.println("El mes es de Noviembre");
            }else if (mes==12) {
                System.out.println("El mes es de Diciembre");
            }

        }else {

            System.out.println("Numero invalido");
        }

        System.out.println(" ***************** Operador ternario *********************");
        System.out.println("Ingrse el mes");
        mes =scanner.nextInt();
        String resultado  = "";
        resultado = !( mes >0 & mes <=12) ?   "Numero Invalido"    :
        mes == 1 ?"Enero" :
                mes == 2 ? "Febrero":
                        mes == 3 ? "Marzp":
                                mes == 4 ? "Abril":
                                        mes == 5 ? "Mayo":
                                                mes == 6 ? "Junio":
                                                        mes == 7 ? "Julio":
                                                                mes == 8 ? "Agosto":
                                                                        mes == 9 ? "Septiembre":
                                                                                mes == 10 ? "Octubre":
                                                                                        mes == 11 ? "Nomviembre":
                                                                                                mes == 12 ? "Dicembre":"Ninguna opción valida";

        System.out.println("El mes es "+resultado);
    }
}
