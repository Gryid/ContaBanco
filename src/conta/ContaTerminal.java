package conta;

public class ContaTerminal {

        //Atributos privados
        private int numeroConta;
        private String agencia;
        private String nomeCliente;
        private float saldo;


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
