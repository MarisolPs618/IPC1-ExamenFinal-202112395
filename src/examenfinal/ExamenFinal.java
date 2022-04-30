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
       Scanner ln = new Scanner(System.in);
       int opcion=0;
       while (opcion!=4){
       System.out.println("*****************");
       System.out.println("   M E N Ú   ");
       System.out.println("1. Número mayor ");
       System.out.println("2. Piramide impar");
       System.out.println("3. ");
       System.out.println("4.Salir ");
       System.out.println("*****************");
       opcion=input.nextInt();
       
       switch(opcion){
           case 1:{
               int n1,n2;
               System.out.println("Ingrese 2 numeros");
               n1=input.nextInt();
               n2=input.nextInt();
               if(n1>n2){
                   System.out.println(n1+" Es el mayor");
               }else if(n2>n1){
                   System.out.println(n2+" Es el mayor");
               }else{
                   System.out.println("Son iguales");
               }
               break;
           }
           case 2:{
               System.out.println("Ingrese un numero impar");
               int n1;
               n1=input.nextInt();
               if ((n1%2)==0){
               while((n1%2)==0){
                    System.out.println("Ingrese un numero impar");
                n1=input.nextInt();
               }
              
               }
               
               for(int fila = 1; fila<=n1; fila=fila+2){
                 for(int i=n1-1; i>=fila; i=i-2){
                System.out.print(" ");
                  }

                 for(int j=1; j<=(fila); j=j+1){
                System.out.print("*");
            }
            System.out.println();
          }
                System.out.println();
                System.out.println();
               break;
           }
           case 3:{
               
               System.out.println("Ingrese el numero de vacas disponibles para la venta");
               int numero,camion;
               String vacas, produccion;
               numero=input.nextInt();
               System.out.println("Ingrese el peso limite del camion");
               camion=input.nextInt();
               System.out.println("Ingrese los pesos de vacas");
               vacas=ln.nextLine();
               System.out.println("Ingrese la produccion en de vacas");
               produccion=ln.nextLine();
               
               int todo[][] = new int[2][numero];
               
               String ArrayVacas[]=vacas.split(",");
               String ArrayProduccion[]=produccion.split(",");
               System.out.println(ArrayVacas.length);
               System.out.println(ArrayProduccion.length);
               for(int i=0;i<numero;i++){
                 
                   todo[0][i]=Integer.parseInt(ArrayVacas[i]);
                   todo[1][i]=Integer.parseInt(ArrayProduccion[i]);
               }
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
