import java.util.function.Function;

public class Main {
    public static void main(String[] args){
       var  resultado = Numero(5,10,15);
        System.out.println(resultado);

        coche miCoche = new coche();
        int a = miCoche.puerta=10;
        int b =miCoche.incrementar;
        System.out.println(a+b);

    }
    public static int Numero(int num1, int num2, int num3){
        return  num1+num2+num3;
    }
}