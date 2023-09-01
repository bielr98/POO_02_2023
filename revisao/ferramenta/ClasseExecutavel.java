package revisao.ferramenta;

public class ClasseExecutavel {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.a = 3;
        calc.b = 5;
        int resultado = calc.somarAeB(calc.a, calc.b); 
        System.out.println("Resultado da soma: " + resultado);
    }
}
