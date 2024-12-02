public class Main {
    public static void main(String[] args) {

        ContaBancaria Normal = new Normal(1001);
        ContaBancaria Poupanca = new Poupanca(1002);
        ContaBancaria Investimento = new Investimento(1003);

        Normal.depositar(500);
        Poupanca.depositar(1000);
        Investimento.depositar(2000);

        Normal.sacar(200);
        Poupanca.sacar(300);
        Investimento.sacar(500);

        Normal.exibirSaldo();
        Poupanca.exibirSaldo();
        Investimento.exibirSaldo();
    }
}
