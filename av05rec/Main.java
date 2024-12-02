public class Main {
    public static void main(String[] args) {
        ContaBancaria contaNormal = new ContaNormal(1001);
        ContaBancaria contaPoupanca = new ContaPoupanca(1002);
        ContaBancaria contaInvestimento = new ContaInvestimento(1003);

        contaNormal.depositar(500); 
        contaPoupanca.depositar(1000, "Poupança"); 
        contaInvestimento.depositar(2000, "Investimento"); 

        contaNormal.sacar(200); 
        contaPoupanca.sacar(300, "Pagamento de contas"); 
        contaInvestimento.sacar(500, "Investimento em ações"); 

        System.out.println();
        contaNormal.exibirSaldo();
        contaPoupanca.exibirSaldo();
        contaInvestimento.exibirSaldo();
    }
}
