package Calculadora;


public class operaciones {
    
    public int suma(int a, int b){
        return a+b;
    }
    
    public int resta(int a, int b){
        return a-b;
    }
    
    public int multiplicacion(int a, int b){
        return a*b;
    }
    
    public double division(int a, int b){
        return a/b;
    }
    
    public double exponenciacion(int a, int b){
        return Math.pow(a,b);
    }
}
