/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Mostrar numero par o impar
 * @author hugov
 */
public class ejercicio3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese un numero:");
        Integer num = cargarNumero();
        /*
        Boolean esPar = (num%2==0);
        if (esPar)
        */
        if(num % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
    public static Integer cargarNumero() throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}
