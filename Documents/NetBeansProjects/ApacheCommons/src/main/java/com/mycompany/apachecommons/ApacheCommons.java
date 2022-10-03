/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.apachecommons;
import org.apache.commons.cli.*;
import java.io.OutputStream;
/**
* -w "Hola Mundo"   -n  "Hola Mundo Bonito"    -c "Hola Mundo Cruel"    -h "Ayuda"     -y "Tras n años de vida"
*/
    public class ApacheCommons  {

    String n;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }
   
 
    
    public static void main(String[] args) throws ParseException    {     
     Options options = new Options();
        options.addOption("w", false, "Hola Mundo");
        options.addOption("h", "help", false, "Imprimir mensaje de ayuda" );
        options.addOption("n","nice", false, "Hola Mundo Bonito");
        options.addOption("c","cruel", false, "Hola Mundo Cruel");
        options.addOption("y","years", true, "Tras n años de vida");
      BasicParser parser  = new BasicParser();  
       CommandLine cmdLine = parser.parse(options, args);  
         if (cmdLine.hasOption("h"))
             System.out.println("Para ejcutar un Hola Mundo, ejecuta el comando w; si quieres ejecutar un Hola Mundo Bonito, ejecuta el comando n o nice;si quieres ejecutar un Hola Mundo Cruel, ejecuta el comando c o cruel, si quieres saber cuando años de vida lleva ejecuta el comando y o years");
              
         if (cmdLine.hasOption("w"))
             System.out.println("Hola mundo");
         
          if (cmdLine.hasOption("c"))
             System.out.println("Hola mundo cruel");
          
          if (cmdLine.hasOption("n"))
             System.out.println("Hola mundo bonito");
          
          if (cmdLine.hasOption("y"))
             System.out.println("Tras n años");
    }
    
  


    

   

    } 


