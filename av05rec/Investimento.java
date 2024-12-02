public class Investimento extends ContaBancaria {
    public Investimento(int numeroConta) {
        super(numeroConta);
    }

    @Override
    public String getTipoConta() {
        return "Investimento";
    }
}
