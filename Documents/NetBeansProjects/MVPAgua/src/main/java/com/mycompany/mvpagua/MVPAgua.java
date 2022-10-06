package com.mycompany.mvpagua;

import java.util.Scanner;
import org.apache.commons.cli.Options;


    public class MVPAgua {
        
        
        static double azaroso() {	
      double numero =  (double)(Math.random()* 100)+1 ;
	  return numero;
        }
    public static void main(String[] args )  {
         double valor1=0;
         double temp = 0;
         System.out.println("Esta es la temperatura actual " + azaroso());
         Scanner sc =new Scanner(System.in);
         System.out.println("Ingresa un valor");
         valor1=sc.nextInt();
         temp = valor1 + azaroso();
         if (temp<0){
            System.out.println("El agua se ha congelado");
         }else{     
         }
         if (temp>100){
            System.out.println("El agua está a mas de 100 grados");
         }else{         
         }
         System.out.println("Hay " + temp + " grados!");
    }
    }
    
