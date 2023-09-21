import java.util.ArrayList;

public class Turma {

    private int id;
    private ArrayList<Tecnico> alunos = new ArrayList<>();

    private static ArrayList<Turma> turmas = new ArrayList<>();

    public Turma(){
        Turma.turmas.add(this);
        this.id = turmas.size();
    }

    public static ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public ArrayList<Tecnico> getAlunos() {
        return alunos;
    }

    public boolean tecnicoEstaNaTurma(Tecnico tecnico){
        return this.alunos.contains(tecnico);
    }

    public boolean adicionarTecnico(Tecnico tecnico){
        return !tecnicoEstaNaTurma(tecnico) && this.alunos.add(tecnico);
    }
}
