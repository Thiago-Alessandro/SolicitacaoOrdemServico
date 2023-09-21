public class Tecnico extends Funcionario{

    private Turma Turma;
    private int demandasRealizadas = 0;
    private int demandasAtribuidas = 0;


    public Tecnico(String nome, int idade, String email, String cpf, Turma turma) {
        super(nome, idade, email, cpf);
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
