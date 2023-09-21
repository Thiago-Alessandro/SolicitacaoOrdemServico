import java.util.ArrayList;

public class Solicitante extends Funcionario implements IVerEstatisticasGerais{

    private ArrayList<Turma> turmas = new ArrayList<Turma>();

    public Solicitante(String nome, int idade, String email, String cpf) {
        super(nome, idade, email, cpf);
    }

    @Override
    public String verEstatisticasGerais() {
        return null;
    }
}
