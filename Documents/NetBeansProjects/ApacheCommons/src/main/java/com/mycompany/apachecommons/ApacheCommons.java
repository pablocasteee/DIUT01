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
public class ApacheCommons {

String n;
String w;
    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }
   
    /**
     *
     */
  
    /**
     *
     * @param args
     */
    public void main(String[] args) throws ParseException {
        
        Options options = new Options();
        options.addOption("w", true, "Hola Mundo");
        options.addOption("h", "help", true, "Imprimir mensaje de ayuda" );
        options.addOption("n","nice", true, "Hola Mundo Bonito");
        options.addOption("c","cruel", true, "Hola Mundo Cruel");
        options.addOption("y","years", true, "Tras "+ n +" años de vida");
        
     BasicParser parser  = new BasicParser();  
    CommandLine cmdLine = parser.parse(options, args);  
         if (cmdLine.hasOption("h"))
             System.out.println("Para ejcutar un Hola Mundo, ejecuta el comando w; si quieres ejecutar un Hola Mundo Bonito, ejecuta el comando n o nice;si quieres ejecutar un Hola Mundo Cruel, ejecuta el comando c o cruel, si quieres saber cuando años de vida lleva ejecuta el comando y o years");
              
         if (cmdLine.hasOption("w"))
             System.out.println(getOptionValue("w"));
         
          if (cmdLine.hasOption("c"))
             System.out.println(getOptionValue("c"));
          
          if (cmdLine.hasOption("n"))
             System.out.println(getOptionValue("n"));
          
          if (cmdLine.hasOption("y"))
             System.out.println(getOptionValue("y"));
    }

    private boolean getOptionValue(String w,String n,String c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean getOptionValue(String y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

   

    } 


