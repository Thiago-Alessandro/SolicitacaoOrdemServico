import java.util.ArrayList;

public class Demanda {

    //a interface IMostrarDados é inutil

    private String status;
    private Solicitante solicitante;

    private ArrayList<Tecnico> tecnicosResponsaveis = new ArrayList<>();
    private ArrayList<Turma> turmasAssociadas = new ArrayList<>();

    private static ArrayList<Demanda> demandas = new ArrayList<>();
    private static ArrayList<Demanda> demandasconcluidas = new ArrayList<>();

}
