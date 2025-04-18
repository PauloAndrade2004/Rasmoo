public class Main {
    public static void main(String[] args) {

        Conta contaPaulo = new Conta();
        contaPaulo.titular = "Paulo Cesar";
        contaPaulo.agencia = 12345;
        contaPaulo.numero = 12345;
        contaPaulo.saldo = 5000;


        // Exemplo 1
        System.out.println("Titular: " + contaPaulo.titular + " Agencia: " + contaPaulo.agencia + " Numero: " + contaPaulo.numero +  " Saldo: R$ " + contaPaulo.saldo);

        //Exemplo 2
        System.out.println("O titular da primeira conta é: " + contaPaulo.titular);
        System.out.println("Agencia: " + contaPaulo.agencia);
        System.out.println("Numero: " + contaPaulo.numero);
        System.out.println("Saldo: " + contaPaulo.saldo);



    }
}
