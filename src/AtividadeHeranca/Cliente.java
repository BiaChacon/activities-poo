package AtividadeHeranca;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(int codigo, String nome, String cpf) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  super.toString() + " Codigo:" + codigo;
    }
  
}
