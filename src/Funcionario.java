import java.util.ArrayList;

public class Funcionario implements IMostrarDados{

    private int cadastro;
    private String nome;
    private int idade;
    private String email;
    private String cpf;

    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(String nome, int idade, String email,String cpf){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        this.cadastro = funcionarios.size() + 1;
        funcionarios.add(this);
    }

    @Override
    public String mostrarDados(Funcionario funcionario) {
        return  "\n\tFuncionario" +
                "\nCadastro: " + this.cadastro +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nEmail: " + this.email +
                "\nCPF: " + this.cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCadastro() {
        return cadastro;
    }

    public String getEmail() {
        return email;
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
