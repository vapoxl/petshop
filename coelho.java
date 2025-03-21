package br.com.petshopp;

public class Coelho extends Animal {
    private String corPelo;

        public Coelho(String nome, int idade, String corPelo) {
        super(nome, idade); 
        this.corPelo = corPelo;
    }

    public void pular() {
        System.out.println(getNome() + " está pulando: Hop hop!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Cor do Pelo: " + corPelo);
    }
}