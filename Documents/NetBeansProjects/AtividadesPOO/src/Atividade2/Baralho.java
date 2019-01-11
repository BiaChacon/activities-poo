package modelo;

import java.util.Random;

public class Baralho {
  private Carta cartas[];
  private int cont = 0;
  private static Random aleatorio;
  private static final int NUMERO_DE_CARTAS = 52;
  

    public Baralho() {   
        cartas = new Carta[NUMERO_DE_CARTAS];
        String[] face = {"A", "J", "K", "Q", "2", "3", "4", "5", "6", "7","8", "9", "10"};
        String[] naipe = {"copas", "espadas","ouros","paus"};
        
        cont = 0;
        aleatorio = new Random();
        int c=0;
        for(int i=0; i < naipe.length ;i++){
            for(int j=0; j< face.length ;j++){
                cartas[c] = new Carta(face[j], naipe[i]);
                c++;
            }
        }
    }
    
    public void mostrarBaralho(){
        System.out.println("------------APRESENTANDO BARALHO-----------------");
      for (Carta i : cartas) {
          System.out.println(i.toString());
      }  
    }
    
    
    public void embaralha(){
        System.out.println("EMBARALHANDO");
       for(int i=0; i<NUMERO_DE_CARTAS; i++){
            int num1 = aleatorio.nextInt(cartas.length);
            int num2 = aleatorio.nextInt(cartas.length);
            
            Carta temp = cartas[num1]; 
            cartas[num1] = cartas[num2];
            cartas[num2] = temp;
       }
        
    }
    
    public Carta[] distribuirCartas(int qtdCartas){
        Carta vetor[];
        vetor = new Carta[qtdCartas];
        for(int i=0; i < qtdCartas; i++){
            vetor[i] = cartas[cont];
            cont++;
        }
        return vetor;
    }
    
    public Carta[] getCartas(){
        return cartas;
    }
}