package conta;

import java.util.Scanner;
public class TestaContaTerminal {

    public static void main(String[] args) {

        // Criar um novo scanner
        Scanner entrada = new Scanner(System.in);

        //Interface com o usuario
        System.out.println("Seja bem vindo ao seu terminal bancário");
        System.out.println("Gentileza siga com o cadastro das informações solicitadas para a criação de sua conta");

        // Solicitar entradas do usuário
        System.out.println("Gentileza informar o seu nome completo");
        String nomeCliente = entrada.nextLine();

        System.out.println("Gentileza informar a agência");
        String agencia = entrada.nextLine();

        System.out.println("Gentileza informar o número da conta");
        int numeroConta= entrada.nextInt();

        System.out.println("Gentileza informar o valor a ser depositado");
        float saldo = entrada.nextFloat();

        // Criar uma nova conta bancária e setar os valores informados pelo usuario
        ContaTerminal novaConta = new ContaTerminal(numeroConta, agencia, nomeCliente,saldo);

        // Exibir mensagem de conta criada
        System.out.println("Olá " +novaConta.getNomeCliente()+ ", obrigado por criar uma conta em nosso banco, sua agência é: "
                +novaConta.getAgencia()+ ", conta: " +novaConta.getNumeroConta()+ " e seu saldo de: " +novaConta.getSaldo()+
                " já está disponível para saque");


    }
}
