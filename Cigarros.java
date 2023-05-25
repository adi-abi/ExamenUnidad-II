
package com.mycompany.cigarros;


public class Cigarros {

     public static void main(String[] args) {
       int matricula = 062275;
       int cantidadHojas = 75;
       int tiempoPicado = 7+5;
       int Aroma = 06;
       int Azucar = 22 ;
       int Nicotina = 0 + 5;
        
        
      int totalCigarrillos = cantidadHojas + tiempoPicado + Aroma + Azucar + Nicotina;  
        System.out.println("Total de cigarrillos:"+ totalCigarrillos /20);
    }
}

