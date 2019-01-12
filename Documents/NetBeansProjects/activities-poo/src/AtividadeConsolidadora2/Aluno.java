package AtividadeConsolidadora2;

public class Aluno extends Usuario implements Avaliavel{
    
    private double desempenho;
    private int contador;
    
    public Aluno(int matricula, String nome) {
        super(matricula, nome);
    }

    @Override
    public void setAvaliacao(double nota) {
        contador++;
        desempenho += nota;
    }

    @Override
    public String getAvaliacao() {
        return "Desempenho atual do aluno nas atividades realizadas: " + desempenho/contador;
        
    }
   
}
