/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Dani
 */
public class Nodo {

    int dato;
    Nodo der;
    Nodo izq;
    Nodo(int dat)
    {
        this.dato=dat;
        this.der=null;
        this.izq=null;
    }
}