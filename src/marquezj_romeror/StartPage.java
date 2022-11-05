/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marquezj_romeror;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class StartPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("---------------------------------------------------");
       System.out.println("---------------------------------------------------");
       AlgoritmoOrdenamiento us= new AlgoritmoOrdenamiento();
       us.ingresoDeDatos();
       System.out.println("---------------------------------------------------");
       System.out.println("---------------------------------------------------");
       System.out.println("Escoja una ocion");
       System.out.println("1-->Ordenar por Seleccion");
       System.out.println("2-->Ordenar por Insecion");
       System.out.println("Ingrese un numero distinto para Finalizar");
       Scanner s = new Scanner(System.in);
       int op = s.nextInt();
       System.out.println("---------------------------------------------------");
       System.out.println("---------------------------------------------------");
        while (op==1 || op==2){
            if (op==1){
                us.ordenarS();
            }
            else if (op==2) {
                us.ordenarI();
            }
            else {
                
            }
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        us.ingresoDatosAux();
        System.out.println("Escoja una ocion");
        System.out.println("1-->Ordenar por Seleccion");
        System.out.println("2-->Ordenar por Insecion");
        System.out.println("Ingrese un numero distinto para Finalizar");
        op= s.nextInt();
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        }
    }
    
}
