package atividade;

import java.util.Scanner;

public class Pessoa {
    // características
    private String nome;
    private int idade;
    private String email;

    // métodos construtores
    public Pessoa() { // construtor padrão
    }

    public Pessoa(String nome, int idade, String email) {
        setIdade(idade);
        setNome(nome);
        setEmail(email);
    }

    // métodos de funcionalidades
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // método para editar os dados
    public void editarDados(Scanner teclado) {
        System.out.println("\nDados atuais da pessoa cadastrada:");
        System.out.println("Nome atual: " + this.nome);
        System.out.println("Idade atual: " + this.idade);
        System.out.println("Email atual: " + this.email);

        teclado.nextLine();
        System.out.println("\nDigite os novos dados:");
        System.out.print("Nome: ");
        this.nome = teclado.nextLine();
        System.out.print("Idade: ");
        this.idade = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Email: ");
        this.email = teclado.nextLine();

        System.out.println("\nDados atualizados com sucesso!\n\n");

    }

    // método para excluir os dados
    public void excluirDados() {
        this.nome = null;
        this.idade = 0;
        this.email = null;

        System.out.println("\nDados excluídos com sucesso!\n");
    }
}
