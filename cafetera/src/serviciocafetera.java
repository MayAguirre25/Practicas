
import cafetera.Cafetera;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aguir
 */
public class serviciocafetera {
    Scanner read =new Scanner(System.in);
    //creamos objeto
    Caf cafetera1=new Cafetera ();
    //metodo llenar
    public void llenarCafetera(){
     cafetera1.setCantidadActual(cafetera1.getCapacidadMaxima());
     
    }

   public void serviTaza(int tamano){
       System.out.println("Ingrese el tamaño");
       tamano=read.nextInt();
       if(tamano <cafetera1.getCantidadactual()){
         cafetera1.setCantidadactual(cafetera1.getCantidadActual-tamano)  
       }
       else{
           System.out.println("no alcanza la taza a llenar");
           cafetera1.setCantidadActual(0);
       }
   }
   //vaciar cafetera
   public void vaciarCafetera(){
       System.out.println("se ha vaciado la cafetera");
       cafetera1.setCantidadActual(0);
   }
   //agregar cafe metodo
   public void agregarCafe(int cancafe){
       System.out.println("ingrese la cantidade de cafe");
       cafetera1.setCantidadActual(cafetera1.getCantidadActual()+ leer.nextInt(cantcafe))
   }
}
