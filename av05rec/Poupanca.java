public class Poupanca extends ContaBancaria {
    public Poupanca(int numeroConta) {
        super(numeroConta);
    }

    @Override
    public String getTipoConta() {
        return "Poupança";
    }
}
