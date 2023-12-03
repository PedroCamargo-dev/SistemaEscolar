package Disciplina;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeDisciplinas {
  private static ArrayList<Disciplina> disciplinas = new ArrayList<>();
  private Scanner scanner = new Scanner(System.in);

  public void gerenciarDisciplinas() {
    int opcao;
    do {
      System.out.println("\n");
      System.out.println("===================================");
      System.out.println("        GERENCIAR DISCIPLINAS      ");
      System.out.println("===================================");
      System.out.println(" 1 - Adicionar Disciplina ");
      System.out.println(" 2 - Listar Disciplinas ");
      System.out.println(" 3 - Remover Disciplina ");
      System.out.println(" 4 - Voltar ao Menu Principal ");
      System.out.println("===================================");
      System.out.print("Escolha uma opção (1 - 4): ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          adicionarDisciplina();
          break;
        case 2:
          listarDisciplinas();
          break;
        case 3:
          removerDisciplina();
          break;
      }
    } while (opcao != 4);
  }

  private void adicionarDisciplina() {
    System.out.println("\n");
    System.out.print("Nome da disciplina: ");
    String nome = scanner.nextLine();

    Disciplina disciplina = new Disciplina(nome);
    disciplinas.add(disciplina);
    System.out.println("-----------------------");
    System.out.println("Disciplina adicionada com sucesso!");
  }

  private void listarDisciplinas() {
    System.out.println("\n");
    System.out.println("LISTA DE DISCIPLINAS");
    for (Disciplina disciplina : disciplinas) {
      System.out.println("Disciplina: " + disciplina.getNome());
    }
  }

  private void removerDisciplina() {
    System.out.println("\n");
    System.out.print("Nome da disciplina a ser removida: ");
    String nome = scanner.nextLine();

    for (Disciplina disciplina : disciplinas) {
      if (disciplina.getNome().equalsIgnoreCase(nome)) {
        disciplinas.remove(disciplina);
        System.out.println("Disciplina removida com sucesso!");
        System.out.println("-----------------------");
        return;
      }
    }

    System.out.println("Disciplina não encontrada.");
  }
}
