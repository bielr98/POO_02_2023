public class verificaNumeroPrimo {

    // Método para verificar se um número é primo ou não
    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; // retorna 0 para números não primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; // 0 para números não primos
            }
        }
        return 1; // 1 para números primos
    }

    // Método main para testar o método verificaNumeroPrimo
    public static void main(String[] args) {
        Integer numero = 29; //Número a ser verificado
        int resultado = verificaNumeroPrimo(numero);
        
        System.out.println("Numero:  " + numero);
        System.out.println("Resultado: " + resultado);

        if (resultado == 1){
            System.out.println("Numero é primo");
        }else{
            System.out.println("Numero não primo");
        }
        // Se o resultado for 1, o número é primo. Se for 0, o número não é primo.
    }
}
