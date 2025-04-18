public class Main {
    public static void main(String[] args) {

        Conta contaPaulo = new Conta();
        contaPaulo.titular = "Paulo Cesar";
        contaPaulo.agencia = 12345;
        contaPaulo.numero = 12345;
        contaPaulo.saldo = 5000;

        Conta contaGabrielle = new Conta();
        contaGabrielle.titular = "Gabrielle";
        contaGabrielle.agencia = 32123;
        contaGabrielle.numero = 3232;
        contaGabrielle.saldo = 5345;

        System.out.println("Titular: " + contaPaulo.titular + " Agencia: " + contaPaulo.agencia + " Numero: " + contaPaulo.numero + " Saldo: R$ " + contaPaulo.saldo);
        System.out.println("Titular: " + contaGabrielle.titular + " Agencia: " + contaGabrielle.agencia + " Numero: " + contaGabrielle.numero + " Saldo: R$ " + contaGabrielle.saldo);




    }
}
