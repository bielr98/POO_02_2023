package revisao.ferramenta;


//classe cria um molde para instanciar o Objeto
public class calculadora {
    public ina a;
    public int b;


    public int somar(){
        return this.a + this.b;
    }

//método estatio é acionavel diretamente na classe, nao necessita de uma instancia
    public static int somarAeB(int a, int b){
       //utilizada diretamente
        calculadora.somarAeB(a, b);

        calculadora calc = new calculadora();
        //apos instanciado pode usar medotos externos
        calc.somar();


    }
}

