/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Mostrar los 100 primeros numeros primos
 * @author hugov
 */
public class ejercicio4 {
    public static void main(String[] args) throws IOException {
        

        String resultado = "";
        
        int numero = 1;
        int contador = 0;
        
        while (contador < 100){
            if(esPrimo(numero)){
                resultado += numero +", ";
                contador++;
            }
            numero++;
        }
        System.out.println("Los 100 primeros numeros primos son:" + resultado);
    }
    private static Boolean esPrimo(Integer numero){
       
        Boolean esUnNumeroPrimo = true;
        
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) { // basta con que el numero sea multiplo de un numero i , el numero  no es primo
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
    }
}

