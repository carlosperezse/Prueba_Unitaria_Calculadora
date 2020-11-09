package Calculadora;


public class Calculadora {
    public static void main (String [] args){
        operaciones operacion1 = new operaciones();
        System.out.println("La suma es          :"+operacion1.suma(6,3));
        System.out.println("La resta es         :"+operacion1.resta(6,3));
        System.out.println("La multiplicación es:"+operacion1.multiplicacion(6,3));
        System.out.println("La división es      :"+operacion1.division(6,3));
        System.out.println("La exponenciación es:"+operacion1.exponenciacion(6,3));
    }
}
