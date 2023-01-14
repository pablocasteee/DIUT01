package com.mycompany.calculadora;


public class Calculadora extends Vista{
  
    Vista v1=new Vista();
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

}
  