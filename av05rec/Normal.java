
public class Normal extends ContaBancaria {
    public Normal(int numeroConta) {
        super(numeroConta);
    }

    @Override
    public String getTipoConta() {
        return "Normal";
    }
}
