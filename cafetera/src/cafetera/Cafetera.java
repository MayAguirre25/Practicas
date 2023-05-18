/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

/**
 *
 * @author aguir
 */
public class Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        serviciocafetera s1=new serviciocafetera();
        s1.llenarCafetera();
        s1.serviTaza();
        s1.vaciarCafetera();
        s1.agregarCafe();
    }
    
}
