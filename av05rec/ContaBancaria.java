public abstract class ContaBancaria {
    protected int numeroConta;
    protected double saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado R$" + valor + " na conta " + getTipoConta());
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Sacado R$" + valor + " da conta " + getTipoConta());
        } else {
            System.out.println("Saldo insuficiente na conta " + getTipoConta());
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo da conta " + getTipoConta() + ": R$" + saldo);
    }

    public abstract String getTipoConta();
}
