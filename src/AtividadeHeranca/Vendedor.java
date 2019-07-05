package AtividadeHeranca;

public class Vendedor extends Funcionario {

    private double vendas;

    public Vendedor(double vendas, int matricula, double salario, String nome, String cpf) {
        super(matricula, salario, nome, cpf);
        this.vendas = vendas;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double calcularPagamento() {
        double salario = getSalario() + (getVendas() * 0.10);
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + " Vendas: " + vendas;
    }

}
