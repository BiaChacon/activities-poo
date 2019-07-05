package Atividade1;

public class Robo {
	private int linha, coluna;
	private Ambiente sala;
	private static final int fatorMovimento = 2;
	
	public Robo(int linha, int coluna, Ambiente sala) {
		this.linha = linha;
		this.coluna = coluna;
		this.sala = sala;
	}
	
	public void mostrarPosicao() {
		System.out.println("[Robo] esta na posi��o ("+linha+","+coluna+") da sala");
	}
	
	public void andarFrente() {
		if(linha+fatorMovimento <= sala.getQtsLinhas() - 1) {
			linha = linha+fatorMovimento;
			System.out.println("[Robo]: Andando para frente\n");
		}
		else {
			System.out.println("Op��o n�o pode ser realizada pois robor saira sala\n");
		}	
	}
	
	public void andarTras() {
		if(linha-fatorMovimento >= 0) {
			linha = linha-fatorMovimento;
			System.out.println("[Robo]: Andando para tr�s\n");
		}
		else {
			System.out.println("Op��o n�o pode ser realizada pois robor saira sala\n");
		}
	}
	
	public void parar() {
		System.out.println("[Robo]: Parado\n");
	}
	public void virarDireita() {
		if(coluna+fatorMovimento <= sala.getQtsColunas() - 1) {
			coluna = coluna+fatorMovimento;
			System.out.println("[Robo]: Vinrando para direita\n");
		}
		else {
			System.out.println("Op��o n�o pode ser realizada pois robor saira sala\n");
		}
	}
	
	public void virarEsquerda() {
		if(coluna-fatorMovimento >= 0) {
			coluna = coluna-fatorMovimento;
			System.out.println("[Robo]: Virando para esquerda\n");
		}
		else {
			System.out.println("Op��o n�o pode ser realizada pois robor saira sala\n");
		}
	}
	
}
