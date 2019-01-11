package Atividade2;

import java.util.Scanner;

public class Jogo {
    private Scanner input = new Scanner(System.in);
    private Baralho baralho;
    private Jogador[] jogador;

    public Jogo() {
      baralho = new Baralho(); 
      baralho.mostrarBaralho();
      baralho.embaralha();
      baralho.mostrarBaralho();
    }
    
    public void iniciarJogo(){
        int qtdJogadores;
        System.out.println("Quantos jogadores irão participar ? obs.: Quantidade máxima = 7");
        qtdJogadores = input.nextInt();
        jogador = new Jogador[qtdJogadores];
        for(int i=0; i < jogador.length; i++){
            System.out.println("Nome do jogador "+ (i+1) +":");
            jogador[i] = new Jogador(input.next());
        }
    }
    
    public void distribuirCartas(int qtdCartas){
        for (int i=0; i <jogador.length; i++) {
            System.out.println("DISTRIBUINDO BARALHO");
            jogador[i].setCartas(baralho.distribuirCartas(qtdCartas));
        }
    }
    
    public void mostrarCartas(){
         for(int i=0; i < jogador.length; i++){
            jogador[i].mostrarCartas();
        }   
    }
    
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciarJogo();
        jogo.distribuirCartas(7);
        jogo.mostrarCartas();
    }
}