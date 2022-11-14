package calculadora;

/**
 *
 * @author pablo
 */
public class Operacion extends Calculadora {
    
    Double  num1;
    Double num2;
    Double resultado;
    
    Calculadora c1=new Calculadora();
    
    
   public void setNum1(){
       c1.num1=num1;
   }
   public Double getNum1(){
       return this.num1;
   }
    
   public void setNum2(){
       c1.num2=num2;
   }
   public Double getNum2(){
       return this.num2;
   }
   
   
   public void getOperando(){
       c1.operando=operando;
   }
   
   public Double sumar(){
       if("+".equals(operando)){
       resultado=num1 + num2;
       
   }
        return resultado;
   }
   
   public Double restar(){
       if("-".equals(operando)){
     resultado=num1 - num2;
       
   }
        return resultado;
   }
   
    public Double dividir(){
       if("/".equals(operando)){
     resultado=num1 / num2;
       
   }
        return resultado;
   }
    
     public Double multiplicar(){
       if("-".equals(operando)){
     resultado=num1 * num2;
       
   }
        return resultado;
   }
}

