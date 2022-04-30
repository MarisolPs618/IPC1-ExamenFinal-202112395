/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author maris
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int opcion=0;
       while (opcion!=4){
       System.out.println("*****************");
       System.out.println("   M E N Ú   ");
       System.out.println("1.     ");
       System.out.println("2. ");
       System.out.println("3. ");
       System.out.println("4.Salir ");
       System.out.println("*****************");
       opcion=input.nextInt();
       switch(opcion){
           case 1:{
               System.out.println("opcion1");
               break;
           }
           case 2:{
               System.out.println("opcion2");
               break;
           }
           case 3:{
               System.out.println("opcion3");
               break;
           }
           case 4:{
               System.exit(0);
           }
           default: {
               System.out.println("opcion no valida");
               break;
           }
       }
       }
    }
    
}
