package atividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        int opcao;
        int idade = 0;
        String nome = "";
        String email = "";
        String confirmacao = "";

        do {
            System.out.println("Bem-vindo ao sistema de cadastro de Pessoas!");
            System.out.println();
            System.out.println("Escolha uma operação: ");
            System.out.println();
            System.out.println("1- Cadastrar uma nova pessoa ");
            System.out.println("2- Editar dados de uma pessoa cadastrada");
            System.out.println("3- Apresentar dados de uma pessoa cadastrada");
            System.out.println("4- Excluir dados de  uma pessoa cadastrada");
            System.out.println("0- Sair");
            System.out.println();
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            System.out.println();

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    teclado.nextLine();

                    System.out.print("Digite o nome: ");
                    nome = teclado.nextLine();
                    pessoa1.setNome(nome);

                    System.out.print("Digite a idade: ");
                    idade = teclado.nextInt();
                    pessoa1.setIdade(idade);

                    teclado.nextLine();

                    System.out.print("Digite o email: ");
                    email = teclado.nextLine();
                    pessoa1.setEmail(email);

                    System.out.println("\nPessoa cadastrada com sucesso!\n\n");
                    break;

                case 2:
                    if (pessoa1.getNome() == null || pessoa1.getNome().isEmpty()) {
                        System.out.println("\nNenhuma pessoa cadastrada. Cadastre Primeiro! \n\n");
                    } else {
                        pessoa1.editarDados(teclado);
                    }
                    break;

                case 3:
                    if (pessoa1.getNome() == null || pessoa1.getNome().isEmpty()) {
                        System.out.println("\nNenhuma pessoa cadastrada. Cadastre Primeiro! \n\n");
                    } else {
                        System.out.println("Dados da pessoa cadastrada:");
                        System.out.print("Nome: " + pessoa1.getNome());
                        System.out.print("\nIdade: " + pessoa1.getIdade());
                        System.out.print("\nE-mail: " + pessoa1.getEmail());
                        System.out.println();
                        System.out.println();
                    }
                    break;

                case 4:
                    if (pessoa1.getNome() == null || pessoa1.getNome().isEmpty()) {
                        System.out.println("\nNenhuma pessoa cadastrada. Cadastre Primeiro! \n\n");
                    }

                    do {
                        System.out.print("\nTem certeza que deseja excluir os dados? (Sim ou Não): ");
                        confirmacao = teclado.next().toLowerCase();
                        if (confirmacao.equals("sim")) {
                            pessoa1.excluirDados();
                        } else if (confirmacao.equals("não")) {
                            System.out.println("\nOperação cancelada.\n\n");
                        }
                        if (!confirmacao.equals("sim") && !confirmacao.equals("não")) {
                            System.out.println("\nEntrada inválida! Digite apenas 'Sim' ou 'Não'.\n\n");
                        }
                    } while (!confirmacao.equals("sim") && !confirmacao.equals("não"));
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção Inválida! Tente novamente.\n\n");
            }

        } while (opcao != 0);
    }
}
