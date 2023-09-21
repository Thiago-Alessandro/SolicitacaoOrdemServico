public class Administrador extends Funcionario implements IVerEstatisticasGerais{

    public Administrador(String nome, int idade, String email, String cpf) {
        super(nome, idade, email, cpf);
    }

    @Override
    public String verEstatisticasGerais() {
        return null;
    }

    @Override
    public String mostrarDados(Funcionario funcionario) {
        return  "\n\tFuncionario" +
                "\nCadastro: " + this.getCadastro() +
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nEmail: " + this.getEmail() +
                "\nCPF: " + this.getCpf();
    }
}
