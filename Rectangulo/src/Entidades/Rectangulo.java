/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author aguir
 */
public class Rectangulo {

    private double altura;
    private double base;

    public Rectangulo() {

    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double superficie() {
        return base * altura;
    }

    public double perimetro() {
        return (base + altura)/2;
    }
    public void obtenerDatos(){
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese la altura");
        altura=read.nextInt();
        this.altura=altura;
        System.out.println("Ingrese la base");
        base=read.nextInt();
        this.base=base;
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
                
            }
             System.out.println("");
        }
    }
}
