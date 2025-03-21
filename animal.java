package br.com.petshopp;

public class Animal {
	private String nome;
	public int idade;

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public int gentIdade() {
		return idade;
	}

	public void exibirInfo() {
		System.out.println("Nome: " + nome + ", Idade:" + idade + " anos");
	}

}