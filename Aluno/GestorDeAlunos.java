package Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeAlunos {
    private List<Aluno> alunos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void gerenciarAlunos() {
        int opcao;
        do {
            System.out.println("\n");
            System.out.println("===================================");
            System.out.println("          GERENCIAR ALUNOS         ");
            System.out.println("===================================");
            System.out.println(" 1 - Adicionar Aluno ");
            System.out.println(" 2 - Listar Alunos ");
            System.out.println(" 3 - Remover Aluno ");
            System.out.println(" 4 - Voltar ao Menu Principal");
            System.out.println("===================================");
            System.out.print("Escolha uma opção (1 - 4): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    removerAluno();
                    break;
            }
        } while (opcao != 4);
    }

    private void adicionarAluno() {
        System.out.println("\n");
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do aluno: ");
        int idade = scanner.nextInt();

        System.out.print("Matrícula do aluno: ");
        int matricula = scanner.nextInt();

        Aluno aluno = new Aluno(nome, idade, matricula);
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
        System.out.println("-----------------------");
    }

    private void listarAlunos() {
        System.out.println("\n");
        System.out.println("LISTA DE ALUNOS");
        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
            System.out.println("-----------------------");
        }
    }

    private void removerAluno() {
        System.out.println("\n");
        System.out.print("Matrícula do aluno a ser removido: ");
        int matricula = scanner.nextInt();

        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);

        System.out.println("Aluno removido com sucesso!");
        System.out.println("-----------------------");
    }
}