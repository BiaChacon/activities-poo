package Atividade1;

import java.util.Scanner;

public class TestarRobo {
	private final Scanner input  = new Scanner(System.in);
	private Ambiente sala;
	private Robo r2d2;
	
	public void definirAmbiente() {
		int qtdL, qtdC;
		System.out.println("Informe o tamanho do ambiente(quantidade de linhas e colunas)");
		qtdL = input.nextInt();
		qtdC = input.nextInt();
		sala = new Ambiente(qtdL, qtdC);
	}
	public void iniciarRobor() {	
		int l, c;
		System.out.println("Informe a posi��o do robor no ambiente (linha e coluna)");
		l = input.nextInt();
		c = input.nextInt();
		r2d2 = new Robo(l, c, sala);
	}
	public void menu() {
		int opcao = 0;
		System.out.println("A sala tem tamanho: "+ sala.getQtsLinhas() + " x " +sala.getQtsColunas());
		do{
			
			r2d2.mostrarPosicao();
			System.out.println( "1 - Andar para Frente\r\n" + 
								"2 - Andar para Tr�s\r\n" + 
								"3 - Parar\n" +
								"4 - Virar para Direita\n" +
								"5 - Virar para Esquerda\n" +
								"6 - Sair\n");
			opcao = input.nextInt();			
			switch(opcao) {
				case 1:
					r2d2.andarFrente();
					break;
				case 2:
					r2d2.andarTras();
					break;
				case 3:
					r2d2.parar();
					break;
				case 4:
					r2d2.virarDireita();
					break;
				case 5:
					r2d2.virarEsquerda();
					break;
				case 6:
					System.out.println("Saindo...\n");
					break;
				default:
					System.out.println("Op��o inv�lida");
			}
		}while(opcao != 6);
	}

	public static void main(String[] args) {
		TestarRobo t = new TestarRobo();
		t.definirAmbiente();
		t.iniciarRobor();
		t.menu();
	}	
}


