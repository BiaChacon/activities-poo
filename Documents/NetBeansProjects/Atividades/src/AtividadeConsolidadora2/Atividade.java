package AtividadeConsolidadora2;

public class Atividade implements Avaliavel{
    
    private String data;
    private boolean onLine;
    private double valor;
    private enum Conceito {RUIM, MEDIANA, BOA};
    private Conceito classificacao;

    public Atividade(String data, boolean onLine, double valor) {
        this.data = data;
        this.onLine = onLine;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isOnLine() {
        return onLine;
    }

    public void setOnLine(boolean onLine) {
        this.onLine = onLine;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Atividade{" + "data=" + data + ", onLine=" + onLine + ", valor=" + valor + ", classificacao=" + classificacao + '}';
    }
    
    @Override
    public void setAvaliacao(double nota) {
        if(nota < 5)
            classificacao = Conceito.RUIM;
        else if(nota <= 7)
            classificacao = Conceito.MEDIANA;
        else
            classificacao = Conceito.BOA;
        
        
    }
    
    @Override
    public String getAvaliacao() {
        return "A atividade esta sendo classificada pelos alunos como "+classificacao;
    }
    
}
