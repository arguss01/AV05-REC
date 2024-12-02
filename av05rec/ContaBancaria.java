public class ContaBancaria {
    protected int numeroConta;
    protected double saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado R$" + valor + " na conta.");
    }

    public void depositar(double valor, String tipoConta) {
        saldo += valor;
        System.out.println("Depositado R$" + valor + " na conta " + tipoConta + ".");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Sacado R$" + valor + " da conta.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void sacar(double valor, String motivo) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Sacado R$" + valor + " da conta. Motivo: " + motivo);
        } else {
            System.out.println("Saldo insuficiente. Motivo: " + motivo);
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
