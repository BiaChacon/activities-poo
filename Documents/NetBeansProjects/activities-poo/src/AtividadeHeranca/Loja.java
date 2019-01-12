package AtividadeHeranca;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    private ArrayList<Pessoa> lista = new ArrayList();

    private Scanner input = new Scanner(System.in);

    private void cadastrar() {

        int opcaoC = 0;

        do {
            System.out.println("       Cadastrar");
            System.out.println("1 - Cliente");
            System.out.println("2 - Administrador");
            System.out.println("3 - Vendedor");
            System.out.println("4 - Voltar");

            opcaoC = input.nextInt();

            if (opcaoC > 4) {
                System.out.println("Opção inválida");
            }

            switch (opcaoC) {
                case 1:
                    System.out.println("       Cadastrar Cliente");
                    String nomeC,
                     cpfC;
                    int codigo;
                    System.out.println("Nome: ");
                    nomeC = input.next();
                    System.out.println("CPF: ");
                    cpfC = input.next();
                    System.out.println("Código: ");
                    codigo = input.nextInt();
                    Cliente c = new Cliente(codigo, nomeC, cpfC);
                    lista.add(c);
                    break;
                case 2:
                    System.out.println("       Cadastrar Administrador");
                    String nomeA,
                     cpfA;
                    int matriculaA;
                    System.out.println("Nome: ");
                    nomeA = input.next();
                    System.out.println("CPF: ");
                    cpfA = input.next();
                    System.out.println("Matricula: ");
                    matriculaA = input.nextInt();
                    Administrativo a = new Administrativo(0, matriculaA, 1000, nomeA, cpfA);
                    lista.add(a);
                    break;
                case 3:
                    System.out.println("       Cadastrar Vendedor");
                    String nomeV,
                     cpfV;
                    int matriculaV;
                    System.out.println("Nome: ");
                    nomeV = input.next();
                    System.out.println("CPF: ");
                    cpfV = input.next();
                    System.out.println("Matricula: ");
                    matriculaV = input.nextInt();
                    Vendedor v = new Vendedor(0, matriculaV, 1000, nomeV, cpfV);
                    lista.add(v);
                    break;
            }

        } while (opcaoC != 4);
    }

    private void remover() {
        String cpfRem;
        System.out.println("CPF: ");
        cpfRem = input.next();
        Pessoa p;
        p = buscar(cpfRem);
        if (p != null) {
            lista.remove(p);
        }
    }

    private Pessoa buscar(String cpf) {
        for (int i = 0; i < lista.size(); i++) {
            if (cpf.equals(lista.get(i).getCpf())) {
                return lista.get(i);
            }
        }
        return null;
    }

    private void buscar() {
        String cpfComp;
        System.out.println("CPF: ");
        cpfComp = input.next();
        Pessoa p;
        p = buscar(cpfComp);
        if (p != null) {
            System.out.println(p.toString());
        }
        System.out.println("Nenhuma pessoa cadastrada com esse CPF");
    }

    private void listar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    private void adicionarProdutividade() {
        
        String cpfAddP;
        System.out.println("Informe CPF de funcionário:");
        cpfAddP = input.next();
        Pessoa p;
        p = buscar(cpfAddP);
        
        if (p != null) {
            if (p instanceof Cliente) {
                System.out.println("CPF invalido para funcionário");
            } else {
                System.out.println("Informe produtividade de funcionário:");
                double produtividade = input.nextDouble();
                if (p instanceof Administrativo) {
                    ((Administrativo) p).setHoras(produtividade);
                } else if (p instanceof Vendedor) {
                    ((Vendedor) p).setVendas(produtividade);
                }
            }
        }
    }

    private void gerarFolhaPagamento() {
        double valor;
        for (Pessoa p : lista) {
            if (p instanceof Administrativo) {
                valor = ((Administrativo) p).calcularPagamento();
                System.out.println(p + " valor:" + valor);
            }
            if (p instanceof Vendedor) {
                valor = ((Vendedor) p).calcularPagamento();
                System.out.println(p + " valor:" + valor);
            }
        }
    }

    public void menu() {

        int opcao = 0;

        do {
            System.out.println("           Loja");
            System.out.println("1 - Cadastrar Pessoas");
            System.out.println("2 - Remover Pessoa");
            System.out.println("3 - Buscar Pessoa");
            System.out.println("4 - Adicionar Produtividade");
            System.out.println("5 - Gerar Folha de Pagamento");
            System.out.println("6 - Listar Pessoas Cadastradas");
            System.out.println("7 - Sair");

            opcao = input.nextInt();

            if (opcao > 6) {
                System.out.println("Opção inválida");
            }

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    remover();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    adicionarProdutividade();
                    break;
                case 5:
                    gerarFolhaPagamento();
                    break;
                case 6:
                    listar();
                    break;
                case 7:
                    System.out.println("saindo...");
                    break;
            }

        } while (opcao != 7);
    }

    public static void main(String[] args) {
        Loja j = new Loja();
        j.menu();
    }
}
