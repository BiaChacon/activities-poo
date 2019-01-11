package AtividadeHeranca;

public class Administrativo extends Funcionario {

    private double horas;

    public Administrativo(double horas, int matricula, double salario, String nome, String cpf) {
        super(matricula, salario, nome, cpf);
        this.horas = horas;
    }
    
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double calcularPagamento() {
        double salario = (getSalario() + getHoras()) * (getSalario() * 0.01);
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + " Horas: " + horas;
    }

}
