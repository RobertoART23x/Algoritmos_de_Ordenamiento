/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marquezj_romeror;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ricar
 */
public class AlgoritmoOrdenamiento {
    private int t =0;//tamanio de la lista
    private int e =0;//elementos de la lista

    ArrayList<Integer> lista = new ArrayList();
    ArrayList listaAux = new ArrayList();
    public void ingresoDeDatos() {
       Scanner v = new Scanner(System.in);
       System.out.print("Ingrese la cantidad de numeros a ordenar: ");
       t=v.nextInt();
       
       for (int i=0; i<t; i++) {
           System.out.print("Ingrese un numero: ");
           e=v.nextInt();
           lista.add(e);
           listaAux.add(e);
       }
    }
    
    public void ingresoDatosAux(){
        lista = listaAux;
    }
    
    public void ordenarS() {
        for (int i=0; i<t; i++) {
            int pm = i; // posicion menor 
            int p = i; // contador de pasadas
            for (int j=i+1; j<t; j++) {
                if (p == i) { // Impresion de las pasadas
                    System.out.println(lista + " " + "pos.menor=" + pm + " " + "pos.j=" + j);
                }
                else { // Impresion de las iteraciones.
                   ArrayList<String> lista2 = new ArrayList(); 
                   for (int x =0; x<t; x++) {
                       if (x==pm) {
                           int e1;
                           e1=lista.get(pm);
                           String cad;
                           cad=Integer.toString(e1); // Trasnformacion de un dato de tipo int a String.
                           lista2.add(cad);
                       }
                       if (x==j) {
                           int e1;
                           e1=lista.get(j);
                           String cad;
                           cad=Integer.toString(e1); // Trasnformacion de un dato de tipo int a String. 
                           lista2.add(cad);
                       }
                       if (x!=pm && x!=j) {
                           String cad;
                           cad = "  ";
                           lista2.add(cad);
                       }
                   }
                   System.out.println(lista2 + " " + "pos.menor=" + pm + " " + "pos.j=" + j);
                } 
                if (lista.get(pm)>lista.get(j)) {
                    pm = j;
                }
                p++;
            }
            if (i != pm) {
                int aux=lista.get(i);
                lista.set(i, lista.get(pm));
                lista.set(pm, aux);
            }
        }
        System.out.println(lista);
    }
        public void ordenarI () {
        for (int i=0; i<t; i++) {
            int pos = i;
            int aux = lista.get(i);
            int p=0;
            while (pos>0) {
                ArrayList lista2 = new ArrayList();
                if ((lista.get(pos-1)>aux)) {
                    for (int x=0;x<t;x++){
                        if (x==(pos-1)){
                            lista2.add(lista.get(pos-1));
                        }
                        else if (x==pos){
                            lista2.add(lista.get(pos));
                        }
                        else if (x==(pos+1)) {
                            lista2.add(lista.get(pos+1));
                        }
                        else {
                            lista2.add(" ");
                        }
                    }
                    if (p==0){
                        System.out.println(lista+" a= "+ lista.get(pos-1) +" b= "+ lista.get(pos));
                    }
                    if (p!=0) {
                        System.out.println(lista2 +" a= "+ lista.get(pos-1) +" b= "+ lista.get(pos));
                    }
                    int aux1 = lista.get(pos);
                    lista.set(pos, lista.get(pos-1));
                    lista.set((pos-1), aux1);
                    
                }
                if ((lista.get(pos-1)<aux)) {
                    for (int x=0;x<t;x++){
                        if (x==(pos-1)){
                            lista2.add(lista.get(pos-1));
                        }
                        else if (x==pos){
                            lista2.add(lista.get(pos));
                        }
                        else if (x==(pos+1)) {
                            lista2.add(lista.get(pos+1));
                        }
                        else {
                            lista2.add(" ");
                        }
                    }
                    if (p==0){
                        System.out.println(lista + " a= "+ lista.get(pos-1) +" b= "+ lista.get(pos));
                    }
                    if (p!=0) {
                        System.out.println(lista2 + " a= "+ lista.get(pos-1) +" b= "+ lista.get(pos));
                    }
                    break; 
                }
                pos--;
                p++;
            }
        }
        System.out.println(lista);
    }
    
}
