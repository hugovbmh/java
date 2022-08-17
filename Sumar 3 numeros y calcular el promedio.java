/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Sumar 3 numeros y calcular el promedio
 * @author hugov
 * 
 */
public class ejercicio2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese 3 numeros:");
        Integer num1 = cargarNumeros();
        Integer num2 = cargarNumeros();
        Integer num3 = cargarNumeros();
        
        Integer sumatoria = num1+num2+num3;
        Double promedio = Double.valueOf(sumatoria)/3;
        System.out.println("El numero promedio es: " + promedio);
    }
    
    public static Integer cargarNumeros() throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}
