package Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeProfessores {
  private ArrayList<Professor> professores = new ArrayList<>();
  private Scanner scanner = new Scanner(System.in);

  public void gerenciarProfessores() {
    int opcao;
    do {
      System.out.println("\n");
      System.out.println("===================================");
      System.out.println("        GERENCIAR PROFESSORES      ");
      System.out.println("===================================");
      System.out.println(" 1 - Adicionar Professor ");
      System.out.println(" 2 - Listar Professores ");
      System.out.println(" 3 - Remover Professor ");
      System.out.println(" 4 - Voltar ao Menu Principal ");
      System.out.println("===================================");
      System.out.print("Escolha uma opção (1 - 4): ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          adicionarProfessor();
          break;
        case 2:
          listarProfessores();
          break;
        case 3:
          removerProfessor();
          break;
      }
    } while (opcao != 4);
  }

  private void adicionarProfessor() {
    System.out.println("\n");
    System.out.print("Nome do professor: ");
    String nome = scanner.nextLine();

    System.out.print("Idade do professor: ");
    int idade = scanner.nextInt();

    System.out.print("Departamento do professor: ");
    scanner.nextLine();
    String departamento = scanner.nextLine();

    Professor professor = new Professor(nome, idade, departamento);
    professores.add(professor);
    System.out.println("Professor adicionado com sucesso!");
    System.out.println("-----------------------");
  }

  private void listarProfessores() {
    System.out.println("\n");
    System.out.println("LISTA DE PROFESSORES");
    for (Professor professor : professores) {
      professor.exibirInformacoes();
      System.out.println("-----------------------");
    }
  }

  private void removerProfessor() {
    System.out.println("\n");
    System.out.print("Nome do professor a ser removido: ");
    String nome = scanner.nextLine();

    for (Professor professor : professores) {
      if (professor.getNome().equalsIgnoreCase(nome)) {
        professores.remove(professor);
        System.out.println("Professor removido com sucesso!");
        System.out.println("-----------------------");
        return;
      }
    }

    System.out.println("Professor não encontrado.");
  }
}
