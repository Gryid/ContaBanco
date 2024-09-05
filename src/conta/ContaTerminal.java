package conta;

public class ContaTerminal {

        //Atributos privados
        private final int numeroConta;
        private final String agencia;
        private final String nomeCliente;
        private final float saldo;


    public ContaTerminal(int numeroConta, String agencia, String nomeCliente, float saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }
}
