package br.com.petshopp;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void exibirInfo();
}

class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cachorro: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + raca);
    }
}

class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Gato: " + getNome() + ", Idade: " + getIdade() + ", Cor do Pelo: " + corPelo);
    }
}

class Coelho extends Animal {
    private String corPelo;

    public Coelho(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Coelho: " + getNome() + ", Idade: " + getIdade() + ", Cor do Pelo: " + corPelo);
    }
}

public class Petshopp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Cachorro");
            System.out.println("2 - Cadastrar Gato");
            System.out.println("3 - Cadastrar Coelho");
            System.out.println("4 - Exibir animais");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente

            switch (opcao) {
                case 1:
                    System.out.println("Nome do Cachorro:");
                    String nomeCachorro = scanner.nextLine();
                    System.out.println("Idade do Cachorro:");
                    int idadeCachorro = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Raça do Cachorro:");
                    String raca = scanner.nextLine();
                    animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
                    System.out.println("Cachorro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Nome do Gato:");
                    String nomeGato = scanner.nextLine();
                    System.out.println("Idade do Gato:");
                    int idadeGato = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Cor do pelo do Gato:");
                    String corPeloGato = scanner.nextLine();
                    animais.add(new Gato(nomeGato, idadeGato, corPeloGato));
                    System.out.println("Gato cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Nome do Coelho:");
                    String nomeCoelho = scanner.nextLine();
                    System.out.println("Idade do Coelho:");
                    int idadeCoelho = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Cor do pelo do Coelho:");
                    String corPeloCoelho = scanner.nextLine();
                    animais.add(new Coelho(nomeCoelho, idadeCoelho, corPeloCoelho));
                    System.out.println("Coelho cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("\nLista de animais:");
                    for (Animal animal : animais) {
                        animal.exibirInfo();
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}