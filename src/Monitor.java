public class Monitor extends Funcionario implements IVerEstatisticasGerais{

    public Monitor(String nome, int idade, String email, String cpf) {
        super(nome, idade, email, cpf);
    }

    @Override
    public String verEstatisticasGerais() {
        return null;
    }
}
